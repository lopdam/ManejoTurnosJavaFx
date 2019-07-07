/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author MINEDUC
 */
public class PantallaBusqueda {
    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton modify = new ImageButton("/images/ModifyButton.png",275,100);
    private ImageButton delete = new ImageButton("/images/DeleteButton.png",275,100);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/LabelSearch.png",800,60,true,true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png",50,50);
    private TableView tv = new TableView();
    private ComboBox cb = new ComboBox();
    private ComboBox cb1 = new ComboBox();


    
    
    public Scene organizar(){
        modify.setLayoutX(65);
        modify.setLayoutY(340);
        modify.setDisable(true);
        delete.setLayoutX(375);
        delete.setLayoutY(340);
        delete.setDisable(true);
        tv.setLayoutX(23);
        tv.setLayoutY(105);
        tv.prefHeight(650);
        tv.prefWidth(225);
        cb.setLayoutX(700);
        cb.setLayoutY(105);
        cb1.setLayoutX(700);
        cb1.setLayoutY(170);
        label.setLayoutX(0);
        label.setLayoutY(25);
        back.setLayoutX(15);
        back.setLayoutY(390);
        root2.getChildren().addAll(label,modify,delete,back,tv,cb,cb1);
        root.getChildren().addAll(fondo,root2);
        return new Scene(root,800,450);
    }


    public ImageButton getBack() {
        return back;
    }
    
    
}
