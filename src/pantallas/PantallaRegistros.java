/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import java.util.Iterator;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author MINEDUC
 */
public class PantallaRegistros {

    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton buscar = new ImageButton("/images/SearchButton.png", 200, 60);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/LastRLabel.png", 800, 60, true, true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png", 50, 50);
    private PantallaBusqueda PB = new PantallaBusqueda();
    private ListView<migracion.Migracion> list = new ListView<>();

    public Scene organizar() {
        buscar.setLayoutX(300);
        buscar.setLayoutY(17);
        back.setLayoutX(15);
        back.setLayoutY(390);
        label.setLayoutX(0);
        label.setLayoutY(105);
        list.setLayoutX(50);
        list.setLayoutY(175);
        root2.getChildren().addAll(buscar, back, label, list);
        root.getChildren().addAll(fondo, root2);

        list.setPrefWidth(700);
        list.setPrefHeight(200);

        return new Scene(root, 800, 450);
    }

    public ImageButton getBuscar() {
        return buscar;
    }

    public ImageButton getBack() {
        return back;
    }

    public PantallaBusqueda getPB() {
        return PB;
    }

    public void ultimoRegistro() {
        List<migracion.Migracion> lista = migracion.Migracion.getRegistroMigratorios();
        lista.sort((migracion.Migracion m1, migracion.Migracion m2) -> {
            if (m1.getFechaMovilizacion().compareTo(m2.getFechaMovilizacion()) == 0) {
                return 0;
            } else if (m1.getFechaMovilizacion().compareTo(m2.getFechaMovilizacion()) <1) {
                return 1;
            } else {
                return -1;
            }

        });
        Iterator<migracion.Migracion> it = lista.iterator();
        list.getItems().clear();
        int i = 1;
        while (it.hasNext() && i < 8) {
            list.getItems().add(it.next());
            i++;

        }
    }

}
