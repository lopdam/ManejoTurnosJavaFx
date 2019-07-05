/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import javafx.scene.Scene;
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
    private ImageButton buscar = new ImageButton("/images/SearchButton.png",200,60);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/LastRLabel.png",800,60,true,true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png",50,50);

    
    
    public Scene organizar(){
        buscar.setLayoutX(300);
        buscar.setLayoutY(17);
        back.setLayoutX(15);
        back.setLayoutY(390);
        label.setLayoutX(0);
        label.setLayoutY(105);
        root2.getChildren().addAll(buscar,back,label);
        root.getChildren().addAll(fondo,root2);
        return new Scene(root,800,450);
    }

    public ImageButton getBuscar() {
        return buscar;
    }

    public ImageButton getBack() {
        return back;
    }
    
    
    
    
}
