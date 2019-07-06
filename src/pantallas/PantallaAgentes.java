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

/**
 *
 * @author MINEDUC
 */
public class PantallaAgentes {
    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageButton turno = new ImageButton("/images/TurnButton.png",325,60);
    private ComboBox cbAgentes = new ComboBox();
    private ComboBox cbMigrante = new ComboBox();
    private ImageButton back = new ImageButton("/images/BackButton-01.png",50,50);
    private PantallaGenerarTurno PGT = new PantallaGenerarTurno();
    private PantallaRegistro PR = new PantallaRegistro();
    
    public Scene organizar(){
        cbAgentes.setLayoutX(100);
        cbAgentes.setLayoutY(100);
        cbMigrante.setLayoutX(300);
        cbMigrante.setLayoutY(100);
        back.setLayoutX(15);
        back.setLayoutY(390);
        turno.setLayoutX(250);
        turno.setLayoutY(375);
        root2.getChildren().addAll(cbAgentes,cbMigrante,turno,back);
        root.getChildren().addAll(fondo,root2);
        return new Scene(root,800,450);
    }

    public ImageButton getBack() {
        return back;
    }

    public PantallaGenerarTurno getPGT() {
        return PGT;
    }

    public ImageButton getTurno() {
        return turno;
    }

    public PantallaRegistro getPR() {
        return PR;
    }
    
    
    
    
    
    
    
    

    
}
