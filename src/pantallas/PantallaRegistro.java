/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import migracion.Migracion;
import Resources.ImageButton;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import migracion.Migrante;

/**
 *
 * @author MINEDUC
 */
public class PantallaRegistro {

    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageButton registrar = new ImageButton("/images/RegistButton.png", 200, 200);
    private ImageView label = new ImageView(new Image("/images/LabelRegistro.png", 800, 60, true, true));
    private ImageView agent = new ImageView(new Image("/images/Agent.png", 140, 140, true, true));
    private String font = "file:fonts/font.ttf";
    private Text po = new Text("ProvOrigen");
    private Text co = new Text("CantOrigen");
    private Text gen = new Text("Genero");
    private Text edad = new Text("Edad");
    private Text anionac = new Text("Nac");
    private Text tipomov = new Text("TipoMov");
    private Text viatrans = new Text("ViaTrans");
    private Text paisproc = new Text("PaisProc");
    private Text paisdest = new Text("PaisDestino");
    private Text fechaMovil = new Text("FechMovil");
    private Text fechaReg = new Text("FechReg");

    private TextField tfpo = new TextField();
    private TextField tfco = new TextField();
    private TextField tfgen = new TextField();
    private TextField tfedad = new TextField();
    private DatePicker tfanionac = new DatePicker(LocalDate.now());
    private TextField tftipomov = new TextField();
    private TextField tfviatrans = new TextField();
    private TextField tfpaisproc = new TextField();
    private TextField tfpaisdest = new TextField();
    private DatePicker tffechaMovil = new DatePicker(LocalDate.now());
    private DatePicker tffechaReg = new DatePicker(LocalDate.now());
    private Button limpiar = new Button("Limpiar");
    private ImageButton back = new ImageButton("/images/BackButton-01.png", 50, 50);

    private Text msm = new Text("");

    public Scene organizar() {

        registrar.setLayoutX(300);
        registrar.setLayoutY(375);
        po.setFont(Font.loadFont(font, 16));
        po.setFill(Color.WHITE);
        co.setFont(Font.loadFont(font, 16));
        co.setFill(Color.WHITE);
        gen.setFont(Font.loadFont(font, 16));
        gen.setFill(Color.WHITE);
        edad.setFont(Font.loadFont(font, 16));
        edad.setFill(Color.WHITE);
        anionac.setFont(Font.loadFont(font, 16));
        anionac.setFill(Color.WHITE);
        tipomov.setFont(Font.loadFont(font, 16));
        tipomov.setFill(Color.WHITE);
        viatrans.setFont(Font.loadFont(font, 16));
        viatrans.setFill(Color.WHITE);
        paisproc.setFont(Font.loadFont(font, 16));
        paisproc.setFill(Color.WHITE);
        paisdest.setFont(Font.loadFont(font, 16));
        paisdest.setFill(Color.WHITE);
        fechaMovil.setFont(Font.loadFont(font, 16));
        fechaMovil.setFill(Color.WHITE);
        fechaReg.setFont(Font.loadFont(font, 16));
        fechaReg.setFill(Color.WHITE);

        agent.setLayoutX(70);
        agent.setLayoutY(100);

        label.setLayoutX(0);
        label.setLayoutY(25);

        po.setLayoutX(280);
        po.setLayoutY(125);
        co.setLayoutX(280);
        co.setLayoutY(163);
        gen.setLayoutX(280);
        gen.setLayoutY(200);

        edad.setLayoutX(557);
        edad.setLayoutY(123);
        anionac.setLayoutX(557);
        anionac.setLayoutY(163);

        tipomov.setLayoutX(17);
        tipomov.setLayoutY(282);
        viatrans.setLayoutX(17);
        viatrans.setLayoutY(320);

        paisproc.setLayoutX(280);
        paisproc.setLayoutY(282);
        paisdest.setLayoutX(280);
        paisdest.setLayoutY(320);

        fechaMovil.setLayoutX(557);
        fechaMovil.setLayoutY(282);
        fechaReg.setLayoutX(557);
        fechaReg.setLayoutY(320);

        tfpo.setLayoutX(375);
        tfpo.setLayoutY(100);
        tfco.setLayoutX(375);
        tfco.setLayoutY(140);
        tfgen.setLayoutX(375);
        tfgen.setLayoutY(180);

        tfedad.setLayoutX(625);
        tfedad.setLayoutY(100);
        tfanionac.setLayoutX(620);
        tfanionac.setLayoutY(140);

        tftipomov.setLayoutX(107);
        tftipomov.setLayoutY(257);
        tfviatrans.setLayoutX(107);
        tfviatrans.setLayoutY(297);

        tfpaisproc.setLayoutX(385);
        tfpaisproc.setLayoutY(257);
        tfpaisdest.setLayoutX(385);
        tfpaisdest.setLayoutY(297);

        tffechaMovil.setLayoutX(625);
        tffechaMovil.setLayoutY(257);
        tffechaReg.setLayoutX(625);
        tffechaReg.setLayoutY(297);
        limpiar.setLayoutX(600);
        limpiar.setLayoutY(390);

        back.setLayoutX(15);
        back.setLayoutY(390);

        msm.setTextAlignment(TextAlignment.CENTER);
        msm.setFill(Color.RED);
        msm.setLayoutX(300);
        msm.setLayoutY(365);

        root2.getChildren().addAll(registrar, label, po, tfpo, co, tfco, gen, tfgen, edad, tfedad, anionac, tfanionac,
                tipomov, tftipomov, viatrans, tfviatrans, paisproc, tfpaisproc, paisdest, tfpaisdest, fechaMovil, tffechaMovil, fechaReg, tffechaReg, limpiar, agent, back, msm);
        root.getChildren().addAll(fondo, root2);
        limpiar.setOnAction(value -> limpiar());
        return new Scene(root, 800, 450);
    }

    public Button getBtnRegisto() {
        return registrar;
    }

    public Button getBack() {
        return back;
    }

    public boolean RegistrarDatos() {
        //Guayas,Guayaquil,femenino,09/08/2000,18
        try {
            if (!verificar()) {
                msm.setText("Datos Incorrectos o Faltantes");
                return false;
            }
            Migrante migrante = new Migrante(tfpo.getText(), tfco.getText(), tfgen.getText(), tfanionac.getValue(), Integer.parseInt(tfedad.getText()));
            Migracion migra = new Migracion(tftipomov.getText(), tfviatrans.getText(), tffechaMovil.getValue(), tffechaReg.getValue(), tfpaisproc.getText(), tfpaisdest.getText(), migrante);
            migracion.Migracion.agregarMigracion(migra);
            msm.setText("Registro Correcto");
            return true;
        } catch (NullPointerException e) {
            msm.setText("Datos Incorrectos o Faltantes");
            return false;
        } catch (NumberFormatException e) {
            msm.setText("Datos Incorrectos o Faltantes");
            return false;
        } catch (Exception e) {
            msm.setText("Datos Incorrectos o Faltantes");
            return false;
        }

    }// //entrada,avion,21/07/2019,07/07/2019,Ecuador,EstadosUnidos

    public boolean verificar() {
        if (tfpo.getText().equals("") || tfco.getText().equals("") || tfgen.getText().equals("")
                || tfedad.getText().equals("")
                || tftipomov.getText().equals("")
                || tfviatrans.getText().equals("")
                || tfpaisproc.getText().equals("")
                || tfpaisdest.getText().equals("")) {
            return false;
        }
        return true;
    }

    public void limpiar() {
        tfpo.setText("");
        tfco.setText("");
        tfgen.setText("");
        tfanionac.setValue(LocalDate.now());
        tfedad.setText("");
        tftipomov.setText("");
        tfviatrans.setText("");
        tffechaMovil.setValue(LocalDate.now());
        tffechaReg.setValue(LocalDate.now());
        tfpaisproc.setText("");
        tfpaisdest.setText("");
        msm.setText("");

    }

}
