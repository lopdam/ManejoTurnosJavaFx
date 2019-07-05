/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author NICOLE
 */
public class PantallaInicio {
    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton registros = new ImageButton("/images/RegisterButton.png",260,210);
    private ImageButton turnos = new ImageButton("/images/TurnSystemButton.png",260,210);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/MSLabel.png",400,50,true,true));
    private PantallaTurnos PT = new PantallaTurnos();
    private PantallaRegistros PR = new PantallaRegistros();
    
    public Scene organizar(){
        registros.setLayoutX(50);
        registros.setLayoutY(140);
        turnos.setLayoutX(470);
        turnos.setLayoutY(140);
        label.setLayoutX(200);
        label.setLayoutY(65);
        root2.getChildren().addAll(registros,turnos,label);
        root.getChildren().addAll(fondo,root2);
        return new Scene(root,800,450);
    }

    public PantallaTurnos getPT() {
        return PT;
    }

    public ImageButton getRegistros() {
        return registros;
    }

    public ImageButton getTurnos() {
        return turnos;
    }

    public PantallaRegistros getPR() {
        return PR;
    }
    
    
    
}
