/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author MINEDUC
 */
public class PantallaSettings {
    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton accept = new ImageButton("/images/AcceptButton.png",200,60);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/OptionsLabel.png",800,60,true,true));
    private ImageView parg = new ImageView(new Image("/images/Parag.png",225,100,true,true));
    private ImageView agent = new ImageView(new Image("/images/Agent.png",90,90,true,true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png",50,50);
    private TextField txt = new TextField();

    
    
    public Scene organizar(){
        accept.setLayoutX(315);
        accept.setLayoutY(365);
        label.setLayoutX(0);
        label.setLayoutY(15);
        parg.setLayoutX(500);
        parg.setLayoutY(175);
        agent.setLayoutX(150);
        agent.setLayoutY(140);
        back.setLayoutX(15);
        back.setLayoutY(390);
        txt.setLayoutX(305);
        txt.setLayoutY(175);
        root2.getChildren().addAll(label,parg,agent,accept,back,txt);
        root.getChildren().addAll(fondo,root2);
        return new Scene(root,800,450);
    }

    public ImageButton getBuscar() {
        return accept;
    }

    public ImageButton getBack() {
        return back;
    }
    
}
