/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import turnos.Asignar;

/**
 *
 * @author MINEDUC
 */
public class PantallaGenerarTurno {

    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageButton turno1 = new ImageButton("/images/NormalButton.png", 200, 200);
    private ImageButton turno2 = new ImageButton("/images/DiscButton.png", 200, 200);
    private ImageButton turno3 = new ImageButton("/images/ThirdButton.png", 200, 200);
    private ImageButton back = new ImageButton("/images/BackButton-01.png", 50, 50);
    private ImageView label = new ImageView(new Image("/images/LabelGenTurn.png", 800, 60, true, true));

    public Scene organizar() {
        turno1.setLayoutX(40);
        turno1.setLayoutY(150);
        turno2.setLayoutX(300);
        turno2.setLayoutY(150);
        turno3.setLayoutX(560);
        turno3.setLayoutY(150);
        label.setLayoutX(0);
        label.setLayoutY(25);
        back.setLayoutX(15);
        back.setLayoutY(390);
        root2.getChildren().addAll(turno1, turno2, turno3, back, label);
        root.getChildren().addAll(fondo, root2);

        funicones();
        return new Scene(root, 800, 450);
    }

    public ImageButton getBack() {
        return back;
    }

    //Carga la funcione agregar
    //Discapacitad=1, terceraEdad=2,Normal=3
    public void funicones() {
        turno1.setOnAction(value
                -> {
            Asignar.agregraTurno(3);
            System.out.println(Asignar.getTurnos().toString());
            Asignar.asignarTurnos();
        });
        turno2.setOnAction(value
                -> {
            Asignar.agregraTurno(1);
            System.out.println(Asignar.getTurnos().toString());
             Asignar.asignarTurnos();
        });
        turno3.setOnAction(value
                -> {
            Asignar.agregraTurno(2);
            System.out.println(Asignar.getTurnos().toString());
             Asignar.asignarTurnos();
        });
    }

}
