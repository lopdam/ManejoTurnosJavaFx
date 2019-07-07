/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import migracion.Migracion;
import migracion.Migrante;

/**
 *
 * @author MINEDUC
 */
public class PantallaBusqueda {

    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton modify = new ImageButton("/images/ModifyButton.png", 275, 100);
    private ImageButton delete = new ImageButton("/images/DeleteButton.png", 275, 100);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/LabelSearch.png", 800, 60, true, true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png", 50, 50);
    private TableView tv = new TableView();
    private ComboBox cb = new ComboBox();
    //private ComboBox cb1 = new ComboBox();
    private TextField txt1 = new TextField();
    private Button buscar = new Button();
   
    private ArrayList<Migracion> migBusquedas = new ArrayList<>();

    public Scene organizar() {
        modify.setLayoutX(515);
        modify.setLayoutY(250);
        //modify.setDisable(true);
        delete.setLayoutX(515);
        delete.setLayoutY(345);
        delete.setOnAction(z -> {
            delete();
        });
        //delete.setDisable(true);
        tv.setLayoutX(23);
        tv.setLayoutY(105);
        tv.prefHeight(650);
        tv.prefWidth(225);
        cb.setLayoutX(600);
        cb.setLayoutY(105);
        txt1.setLayoutX(600);
        txt1.setLayoutY(155);
        buscar.setLayoutX(700);
        buscar.setLayoutY(205);

        buscar.setText("Buscar");
        label.setLayoutX(0);
        label.setLayoutY(25);
        back.setLayoutX(575);
        back.setLayoutY(195);
        root2.getChildren().addAll(label, modify, delete, back, tv, cb, txt1, buscar);
        root.getChildren().addAll(fondo, root2);

        buscar.setOnAction(z -> {
            buscar();
        });

        ObservableList<String> opcBusq = FXCollections.observableArrayList("fecha", "Provincia Origen",
                "Canton Origen", "Lugar Destino");

        cb.setItems(opcBusq);

        TableColumn<Migracion, String> tipoMov = new TableColumn<>("tipo");
        tipoMov.setCellValueFactory(new PropertyValueFactory<Migracion, String>("tipoMov"));
        TableColumn<Migracion, String> viaTransporte = new TableColumn<>("viaTransporte");
        viaTransporte.setCellValueFactory(new PropertyValueFactory<Migracion, String>("viaTransporte"));
        TableColumn<Migracion, Date> fechaMovilizacion = new TableColumn<>("Fecha Movilizacion");
        fechaMovilizacion.setCellValueFactory(new PropertyValueFactory<Migracion, Date>("fechaMovilizacion"));
        TableColumn<Migracion, Date> fechaRegistro = new TableColumn<>("Fecha Registro");
        fechaRegistro.setCellValueFactory(new PropertyValueFactory<Migracion, Date>("fechaRegistro"));
        TableColumn<Migracion, String> paisProc = new TableColumn<>("Procedencia");
        paisProc.setCellValueFactory(new PropertyValueFactory<Migracion, String>("paisProc"));
        TableColumn<Migracion, String> paisDestino = new TableColumn<>("Destino");
        paisDestino.setCellValueFactory(new PropertyValueFactory<Migracion, String>("paisDestino"));

        //Las columnas de migrante que no se como acomodar xd
        TableColumn<Migrante, String> provOrg = new TableColumn<>("Provincia Org");
        provOrg.setCellValueFactory(new PropertyValueFactory<Migrante, String>("provOrg"));
        TableColumn<Migrante, String> cantonOrg = new TableColumn<>("Canton org");
        cantonOrg.setCellValueFactory(new PropertyValueFactory<Migrante, String>("cantonOrg"));
        TableColumn<Migrante, String> sexo = new TableColumn<>("Sexo");
        sexo.setCellValueFactory(new PropertyValueFactory<Migrante, String>("sexo"));
        TableColumn<Migrante, Date> fecNac = new TableColumn<>("fecha nac");
        fecNac.setCellValueFactory(new PropertyValueFactory<Migrante, Date>("fecNac"));
        TableColumn<Migrante, Integer> edad = new TableColumn<>("edad");
        edad.setCellValueFactory(new PropertyValueFactory<Migrante, Integer>("edad"));

        tv.getColumns().addAll(tipoMov, viaTransporte, fechaMovilizacion, fechaRegistro, paisProc,
                paisDestino/*, provOrg, cantonOrg, sexo, fecNac, edad*/);
        ObservableList<Migracion> migrations = FXCollections.observableArrayList(Migracion.getRegistroMigratorios());

        tv.setItems(migrations);
        tv.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        return new Scene(root, 800, 450);
    }

    public ImageButton getBack() {
        return back;
    }

    public void buscar() {
        if (cb.getSelectionModel().getSelectedItem().toString().equalsIgnoreCase("fecha")) {
            ListIterator<Migracion> lt1 = Migracion.getRegistroMigratorios().listIterator();
            while (lt1.hasNext()) {
                if (txt1.getText().equals(lt1.next().getFechaRegistro())) {
                    migBusquedas.add(lt1.next());
                    ObservableList<Migracion> migrations = FXCollections.observableArrayList(migBusquedas);
                    tv.setItems(migrations);
                }
            }
        } else if (cb.getSelectionModel().getSelectedItem().toString().equalsIgnoreCase("Provincia Origen")) {
            ListIterator<Migracion> lt1 = Migracion.getRegistroMigratorios().listIterator();
            while (lt1.hasNext()) {
                if (txt1.getText().equals(lt1.next().getMigrante().getProvOrg())) {
                    migBusquedas.add(lt1.next());
                    ObservableList<Migracion> migrations = FXCollections.observableArrayList(migBusquedas);
                    tv.setItems(migrations);
                }
            }
        } else if (cb.getSelectionModel().getSelectedItem().toString().equalsIgnoreCase("Canton Origen")) {
            ListIterator<Migracion> lt1 = Migracion.getRegistroMigratorios().listIterator();
            while (lt1.hasNext()) {
                if (txt1.getText().equals(lt1.next().getMigrante().getCantonOrg())) {
                    migBusquedas.add(lt1.next());
                    ObservableList<Migracion> migrations = FXCollections.observableArrayList(migBusquedas);
                    tv.setItems(migrations);
                }
            }
        } else if (cb.getSelectionModel().getSelectedItem().toString().equalsIgnoreCase("Lugar Destino")) {
            ListIterator<Migracion> lt1 = Migracion.getRegistroMigratorios().listIterator();
            while (lt1.hasNext()) {
                if (txt1.getText().equals(lt1.next().getPaisDestino())) {
                    migBusquedas.add(lt1.next());
                    ObservableList<Migracion> migrations = FXCollections.observableArrayList(migBusquedas);
                    tv.setItems(migrations);
                }
            }
        }
    }

    public void delete() {
        Migracion m = (Migracion) tv.getSelectionModel().getSelectedItem();
        Migracion.getRegistroMigratorios().remove(m);
        ObservableList<Migracion> migrations = FXCollections.observableArrayList(Migracion.getRegistroMigratorios());
        tv.setItems(migrations);
         Migracion.UpDate();
        tv.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }
}
