
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Resources.ImageButton;
import empleados.Admin;
import empleados.Agente;
import espol.edu.ec.ListaCircularDoble.ListaCircular;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import turnos.Asignar;
import turnos.Turno;

/**
 *
 * @author Odalys
 */
public class PantallaTurnosD {

    private BorderPane root = new BorderPane();
    private Label tiempo;
    static Label mensaje;
    static ListIterator<Image> it;
    static Label mostrarTurno;
    static Label mostrarPuesto;
    static ListaCircular<Image> listai;
    static ImageView imagenn = new ImageView();
    private Button sgtPagina;
    private static VBox vbox = new VBox(10);

    public PantallaTurnosD() {

        ordenarElementos();
        Thread t2 = new Thread(new Publicidad());
        t2.start();
        root = new BorderPane();
        root.setBottom(crearBajo());
        root.setTop(crearArriba());
        root.setCenter(ordenarElementos());

        root.setRight(vbox);
        
        Thread t1 = new Thread(new tiempo());

        t1.start();

    }

    public Pane ordenarElementos() {
        VBox imagenes = new VBox();
        listai = new ListaCircular();
        listai.addLast(new Image(new File("src/images/im1.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im2.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im3.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im4.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im5.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im6.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im7.jpg").toURI().toString()));
        listai.addLast(new Image(new File("src/images/im8.jpg").toURI().toString()));
        imagenes.getChildren().add(imagenn);
        return imagenes;

    }

    public Scene getScene() {
        return new Scene(root, 800, 450);
    }

    public Button saliPublicidad() {
        return sgtPagina;
    }

    public Pane crearBajo() {
        VBox abajo = new VBox();
        abajo.setAlignment(Pos.CENTER);
        abajo.setPadding(new Insets(5, 5, 5, 5));
        HBox botones = new HBox();
        botones.setAlignment(Pos.CENTER);
        sgtPagina = new Button("Salir");
        botones.setPadding(new Insets(5, 5, 5, 5));
        mensaje = new Label("");
        botones.getChildren().addAll(sgtPagina, mensaje);
        abajo.getChildren().add(botones);
        Label mensajer = new Label("Horario de atención de Lunes a Viernes de 10 a 18 Hs/ Sabado y Domingos"
                + " de 10 a 14 hs");
        mensajer.setStyle("-fx-background-color:#66CDAA");
        mensajer.setFont(new Font("Arial Black", 12));
        mensajer.setTextFill(Color.web("#FFFFFF"));
        abajo.getChildren().add(mensajer);

        sgtPagina.setOnAction((e) -> {

        });

        return abajo;
    }

    public Pane crearArriba() {
        HBox arriba = new HBox();
        arriba.setPadding(new Insets(5, 5, 5, 5));
        arriba.setAlignment(Pos.CENTER_RIGHT);
        tiempo = new Label("");
        tiempo.setFont(new Font("Arial Black", 25));
        arriba.getChildren().add(tiempo);

        return arriba;

    }

    public Pane crearDerecha() {
        HBox panel = new HBox();
        panel.setSpacing(5);
        panel.setPadding(new Insets(5, 5, 5, 5));

        VBox turno = new VBox();
        turno.setSpacing(5);

        HBox titulo1 = new HBox();
        titulo1.setPrefHeight(100);
        titulo1.setPrefWidth(200);
        titulo1.setAlignment(Pos.CENTER);
        titulo1.setStyle("-fx-background-color:#87CEFA");
        HBox titulo2 = new HBox();
        titulo2.setPrefHeight(100);
        titulo2.setPrefWidth(200);
        titulo2.setAlignment(Pos.CENTER);
        titulo2.setStyle("-fx-background-color:#87CEFA");

        mostrarTurno = new Label("");

        Label nombreturno = new Label("Turno");
        nombreturno.setFont(new Font("Arial Black", 20));
        titulo1.getChildren().add(nombreturno);
        titulo2.getChildren().add(mostrarTurno);

        turno.getChildren().addAll(titulo1, titulo2);

        VBox puesto = new VBox();
        puesto.setSpacing(5);

        HBox puesto1 = new HBox();
        puesto1.setPrefHeight(100);
        puesto1.setPrefWidth(200);
        puesto1.setAlignment(Pos.CENTER);
        puesto1.setStyle("-fx-background-color:#4682B4");
        HBox puesto2 = new HBox();
        puesto2.setPrefHeight(100);
        puesto2.setPrefWidth(200);
        puesto2.setAlignment(Pos.CENTER);
        puesto2.setStyle("-fx-background-color:#4682B4");

        Label nombrepuesto = new Label("Puesto");
        nombrepuesto.setFont(new Font("Arial Black", 20));

        mostrarPuesto = new Label("");

        puesto2.getChildren().add(mostrarPuesto);

        puesto1.getChildren().add(nombrepuesto);
        // puesto.getChildren().addAll(tablaTurnos);

        panel.getChildren().addAll(turno, puesto);
        return panel;

    }

    public class tiempo implements Runnable {

        @Override
        public void run() {

            while (true) {
                try {
                    LocalDateTime l2 = LocalDateTime.now();
                    Platform.runLater(() -> {

                        tiempo.setText(String.valueOf(l2.getHour()) + " : " + String.valueOf(l2.getMinute()) + " : " + String.valueOf(l2.getSecond()));
                    });
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PantallaTurnosD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public class Publicidad implements Runnable {

        @Override
        public void run() {
            it = listai.listIterator();
            while (true) {
                Platform.runLater(() -> {
                    Image im = it.next();
                    imagenn.setImage(im);
                    imagenn.setFitHeight(300);
                    imagenn.setFitWidth(500);

                });
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.err.println("Error ");
                }
            }

        }

    }

    public static void Derecha() {
        vbox.getChildren().clear();
        
        HBox hbox1 = new HBox(10);
        vbox.getChildren().add(hbox1);

        Button btn1 = new Button("Turno");
        Button btn2 = new Button("Puesto");

        btn1.setTextAlignment(TextAlignment.CENTER);
        btn2.setTextAlignment(TextAlignment.CENTER);
        btn1.setMinSize(100, 75);
        btn2.setMinSize(100, 75);

        hbox1.getChildren().addAll(btn1, btn2);

        Iterator<Agente> it = Admin.getAgentes().iterator();
        for (int i = 0; i < 3; i++) {
            if (it.hasNext()) {
                Agente a = it.next();
                if (a.isOcupado()) {
                    HBox tmp1 = new HBox(10);

                    Button tmpB1 = new Button(a.getTurno().toString());
                    Button tmpB2 = new Button(a.toString());

                    tmpB1.setTextAlignment(TextAlignment.CENTER);
                    tmpB2.setTextAlignment(TextAlignment.CENTER);
                    tmpB1.setMinSize(100, 75);
                    tmpB2.setMinSize(50, 75);

                    tmp1.getChildren().addAll(tmpB1, tmpB2);
                    vbox.getChildren().add(tmp1);

                }
            }
        }

    }

}
