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
 * @author NICOLE
 */
public class PantallaTurnos {
    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton agentes = new ImageButton("/images/AGButton.png",260,210);
    private ImageButton pantallaTurnos = new ImageButton("/images/TSButton.png",260,210);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/TSLabel.png",400,50,true,true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png",50,50);
    private ImageButton settings = new ImageButton("/images/SettingsButton.png",40,40);
    private PantallaAgentes PA = new PantallaAgentes();
    private PantallaSettings PS = new PantallaSettings();
    
    
    public Scene organizar(){
        agentes.setLayoutX(50);
        agentes.setLayoutY(140);
        pantallaTurnos.setLayoutX(470);
        pantallaTurnos.setLayoutY(140);
        back.setLayoutX(15);
        back.setLayoutY(390);
        label.setLayoutX(200);
        label.setLayoutY(65);
        settings.setLayoutX(750);
        settings.setLayoutY(10);
        root2.getChildren().addAll(agentes,pantallaTurnos,back,settings,label);
        root.getChildren().addAll(fondo,root2);
        return new Scene(root,800,450);
    }

    public ImageButton getAgentes() {
        return agentes;
    }

    public ImageButton getPantallaTurnos() {
        return pantallaTurnos;
    }

    public PantallaSettings getPS() {
        return PS;
    }
    
    

    public ImageButton getBack() {
        return back;
    }

    public ImageButton getSettings() {
        return settings;
    }

    public PantallaAgentes getPA() {
        return PA;
    }
    
    
    
    
    
    
    
    
}
