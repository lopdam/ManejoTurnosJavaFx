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
import turnos.Asignar;

/**
 *
 * @author NICOLE
 */
public class main extends Application {

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
        Scene sc8 = pantallaInicio.getPT().getPA().getPR().organizar();
        Scene sc9 = pantallaInicio.getPT().getPTD().getScene();

        Scene sc10 = pantallaInicio.getPR().getPB().getPM().organizar();//Pantalla Modificar

        pantallaInicio.getPR().getPB().getModificar().setOnAction(value -> {
            migracion.Migracion migracion = pantallaInicio.getPR().getPB().modificar();
            if (pantallaInicio.getPR().getPB().getPM().setDatos(migracion)) {
                primaryStage.setScene(sc10);
            }
        });

        pantallaInicio.getPR().getPB().getPM().getBtnRegisto().setOnAction(value -> {
            if (pantallaInicio.getPR().getPB().getPM().RegistrarDatos()) {
                pantallaInicio.getPR().getPB().getPM().limpiar();
                primaryStage.setScene(sc7);
                pantallaInicio.getPR().getPB().llenarTabla();
            }

        });

        pantallaInicio.getPR().getPB().getPM().getBack().setOnAction(value -> {
            if (migracion.Migracion.agregarMigracion(pantallaInicio.getPR().getPB().actualModify())) {
                primaryStage.setScene(sc7);
                pantallaInicio.getPR().getPB().llenarTabla();
            }

        });

        pantallaInicio.getTurnos().setOnAction(e -> primaryStage.setScene(sc2));
        pantallaInicio.getRegistros().setOnAction(e -> {
            pantallaInicio.getPR().ultimoRegistro();
            primaryStage.setScene(sc3);
        });
        pantallaInicio.getPT().getBack().setOnAction(e -> {

            primaryStage.setScene(sc);
        });
        pantallaInicio.getPR().getBack().setOnAction(e -> primaryStage.setScene(sc));
        pantallaInicio.getPT().getAgentes().setOnAction(e -> {
            pantallaInicio.getPT().getPA().llenarAgentes();

            primaryStage.setScene(sc4);
        });
        pantallaInicio.getPT().getPA().getBackAgente().setOnAction(e -> {
            
            pantallaInicio.getPT().getPA().getBtnMigrante().setText("");
            primaryStage.setScene(sc2);
        });
        pantallaInicio.getPT().getPA().getTurno().setOnAction(e -> {
            pantallaInicio.getPT().getPA().getBtnMigrante().setText("");
            primaryStage.setScene(sc5);
        });
        pantallaInicio.getPT().getPA().getPGT().getBackGenTurnos().setOnAction(e -> {
            primaryStage.setScene(sc4);
            Asignar.asignarTurnos();
            pantallaInicio.getPT().getPA().llenarAgentes();
            
        });
        pantallaInicio.getPT().getPS().getBack().setOnAction(e -> primaryStage.setScene(sc2));
        pantallaInicio.getPT().getSettings().setOnAction(e -> primaryStage.setScene(sc6));
        pantallaInicio.getPR().getBuscar().setOnAction(e -> primaryStage.setScene(sc7));
        pantallaInicio.getPR().getPB().getBack().setOnAction(e -> primaryStage.setScene(sc3));
        pantallaInicio.getPT().getPantallaTurnos().setOnAction(value -> {
            pantallaInicio.getPT().getPTD().Derecha();
            primaryStage.setScene(sc9);
        });

        pantallaInicio.getPT().getPTD().saliPublicidad().setOnAction(e -> primaryStage.setScene(sc2));

        pantallaInicio.getPT().getPA().getBtnMigrante().setOnAction(e -> {
            pantallaInicio.getPT().getPA().AgenteRegistrador().setOcupado(false);
            Asignar.asignarTurnos();
            pantallaInicio.getPT().getPA().llenarAgentes();
            //pantallaInicio.getPT().getPA().AgenteRegistrador().atender();
            primaryStage.setScene(sc8);
        });

        pantallaInicio.getPT().getPA().getPR().getBtnRegisto().setOnAction(e -> {

            if (pantallaInicio.getPT().getPA().getPR().RegistrarDatos()) {
                pantallaInicio.getPT().getPA().getPR().limpiar();
            }

        });
        pantallaInicio.getPT().getPA().getPR().getBack().setOnAction(value -> {
            pantallaInicio.getPT().getPA().getBtnMigrante().setText("");
            pantallaInicio.getPT().getPA().getPR().limpiar();
            primaryStage.setScene(sc4);
        });

        primaryStage.setTitle("Migration System");
        primaryStage.setScene(sc);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        migracion.ReaderWriter.leerRegistrosM();
        launch(args);
    }

}
