/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author NICOLE
 */
public class Pantallas extends Application {

    private static final PantallaInicio pantallaInicio = new PantallaInicio();
    

    @Override
    public void start(Stage primaryStage) {
        Scene sc = pantallaInicio.organizar();
        Scene sc2 = pantallaInicio.getPT().organizar();
        Scene sc3 = pantallaInicio.getPR().organizar();
        Scene sc4 = pantallaInicio.getPT().getPA().organizar();
        Scene sc5 = pantallaInicio.getPT().getPA().getPGT().organizar();
        
        pantallaInicio.getTurnos().setOnAction(e->primaryStage.setScene(sc2));
        pantallaInicio.getRegistros().setOnAction(e->primaryStage.setScene(sc3));
        pantallaInicio.getPT().getBack().setOnAction(e-> primaryStage.setScene(sc));
        pantallaInicio.getPR().getBack().setOnAction(e-> primaryStage.setScene(sc));
        pantallaInicio.getPT().getAgentes().setOnAction(e->primaryStage.setScene(sc4));
        pantallaInicio.getPT().getPA().getBack().setOnAction(e->primaryStage.setScene(sc2));
        pantallaInicio.getPT().getPA().getTurno().setOnAction(e->primaryStage.setScene(sc5));
        pantallaInicio.getPT().getPA().getPGT().getBack().setOnAction(e->primaryStage.setScene(sc4));
        primaryStage.setTitle("Migration System");
        primaryStage.setScene(sc);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
