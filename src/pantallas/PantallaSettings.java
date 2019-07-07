/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import empleados.Admin;
import pantallas.PantallaAgentes;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author MINEDUC
 */
public class PantallaSettings {

    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageButton accept = new ImageButton("/images/AcceptButton.png", 200, 60);
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageView label = new ImageView(new Image("/images/OptionsLabel.png", 800, 60, true, true));
    private ImageView parg = new ImageView(new Image("/images/Parag.png", 225, 100, true, true));
    private ImageView agent = new ImageView(new Image("/images/Agent.png", 90, 90, true, true));
    private ImageButton back = new ImageButton("/images/BackButton-01.png", 50, 50);
    private TextField txt = new TextField();
    private Label msm = new Label();
    private int max=10;//Maximo numero de agentes

    public Scene organizar() {
        accept.setLayoutX(315);
        accept.setLayoutY(365);
        msm.setLayoutX(315);
        msm.setLayoutY(340);
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
        root2.getChildren().addAll(label, parg, agent, msm, accept, back, txt);
        root.getChildren().addAll(fondo, root2);
        msm.setTextFill(Color.RED);
        msm.setTextAlignment(TextAlignment.CENTER);
        eventos();
        return new Scene(root, 800, 450);
    }

    public ImageButton getBuscar() {
        return accept;
    }

    public ImageButton getBack() {
        return back;
    }

    public boolean agregraAgentes(int numero) {
        if (numero < 1 || numero > max) {
            msm.setText("No se acepta es numero de Agentes");
            return false;
        }
        Admin.getAgentes().clear();
        for (int i = 1; i <= numero; i++) {

            Admin.agregarAgente(i);
        }
        msm.setText("Asignacion Correcta");
        System.out.println(Admin.getAgentes().toString());
        PantallaAgentes ag=new PantallaAgentes();
        ag.llenarAgentes();
        return true;

    }

    public void eventos() {
        accept.setOnAction(value -> {
            String cantidad = txt.getText();
            int valor;
            try {
                valor = Integer.parseInt(cantidad);
                agregraAgentes(valor);
            } catch (NumberFormatException e) {
                msm.setText("Formato Incorrecto");
            } catch (Exception ex) {
                msm.setText("Formato Incorrecto");
            }

        });
    }

}
