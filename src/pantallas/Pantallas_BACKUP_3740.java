/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Migracion.ReaderWriter;
import javafx.application.Application;
import javafx.scene.Scene;
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
        Scene sc6 = pantallaInicio.getPT().getPS().organizar();
        Scene sc7 = pantallaInicio.getPR().getPB().organizar();
<<<<<<< HEAD
        Scene sc8 = pantallaInicio.getPT().getPA().getPR().organizar();
        
        pantallaInicio.getTurnos().setOnAction(e->primaryStage.setScene(sc2));
        pantallaInicio.getRegistros().setOnAction(e->primaryStage.setScene(sc3));
        pantallaInicio.getPT().getBack().setOnAction(e-> primaryStage.setScene(sc));
        pantallaInicio.getPR().getBack().setOnAction(e-> primaryStage.setScene(sc));
        pantallaInicio.getPT().getAgentes().setOnAction(e->primaryStage.setScene(sc4));
        pantallaInicio.getPT().getPA().getBack().setOnAction(e->primaryStage.setScene(sc2));
        pantallaInicio.getPT().getPA().getTurno().setOnAction(e->primaryStage.setScene(sc5));
        pantallaInicio.getPT().getPA().getPGT().getBack().setOnAction(e->primaryStage.setScene(sc4));
        pantallaInicio.getPT().getPS().getBack().setOnAction(e->primaryStage.setScene(sc2));
        pantallaInicio.getPT().getSettings().setOnAction(e->primaryStage.setScene(sc6));
        pantallaInicio.getPR().getBuscar().setOnAction(e->primaryStage.setScene(sc7));
        pantallaInicio.getPR().getPB().getBack().setOnAction(e->primaryStage.setScene(sc3));
                
=======

        pantallaInicio.getTurnos().setOnAction(e -> primaryStage.setScene(sc2));
        pantallaInicio.getRegistros().setOnAction(e -> primaryStage.setScene(sc3));
        pantallaInicio.getPT().getBack().setOnAction(e -> primaryStage.setScene(sc));
        pantallaInicio.getPR().getBack().setOnAction(e -> primaryStage.setScene(sc));
        pantallaInicio.getPT().getAgentes().setOnAction(e -> primaryStage.setScene(sc4));
        pantallaInicio.getPT().getPA().getBack().setOnAction(e -> primaryStage.setScene(sc2));
        pantallaInicio.getPT().getPA().getTurno().setOnAction(e -> primaryStage.setScene(sc5));
        pantallaInicio.getPT().getPA().getPGT().getBack().setOnAction(e -> primaryStage.setScene(sc4));
        pantallaInicio.getPT().getPS().getBack().setOnAction(e -> primaryStage.setScene(sc2));
        pantallaInicio.getPT().getSettings().setOnAction(e -> primaryStage.setScene(sc6));
        pantallaInicio.getPR().getBuscar().setOnAction(e -> primaryStage.setScene(sc7));
        pantallaInicio.getPR().getPB().getBack().setOnAction(e -> primaryStage.setScene(sc3));

>>>>>>> 6cc8b45ab87dffa62a98e0ab65cadd4c382e8556
        primaryStage.setTitle("Migration System");
        primaryStage.setScene(sc);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReaderWriter.leerRegistrosM();
        launch(args);

    }

}
