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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author MINEDUC
 */
public class PantallaRegistro {
    private StackPane root = new StackPane();
    private Pane root2 = new Pane();
    private ImageView fondo = new ImageView(new Image("/images/fondo.png"));
    private ImageButton registrar = new ImageButton("/images/RegistButton.png", 200, 200);
    private ImageView label = new ImageView(new Image("/images/LabelRegistro.png", 800, 60, true, true));
    private ImageView agent = new ImageView(new Image("/images/Agent.png",140,140,true,true));
    private String font = "file:fonts/font.ttf";
    private Text po = new Text("ProvOrigen");
    private Text co = new Text("CantOrigen");
    private Text gen = new Text("Genero");
    private Text edad = new Text("Edad");
    private Text anionac = new Text("AñoNac");
    private Text tipomov = new Text("TipoMov");
    private Text viatrans = new Text("ViaTrans");
    private Text paisproc = new Text("PaisProc");
    private Text paisdest = new Text("PaisDestino");
    private Text dia = new Text("Dia");
    private Text mes = new Text("Mes");
    private Text anio = new Text("Año");
    private TextField tfpo = new TextField();
    private TextField tfco = new TextField();
    private TextField tfgen = new TextField();
    private TextField tfedad = new TextField();
    private TextField tfanionac = new TextField();
    private TextField tftipomov = new TextField();
    private TextField tfviatrans = new TextField();
    private TextField tfpaisproc = new TextField();
    private TextField tfpaisdest = new TextField();
    private TextField tfdia = new TextField();
    private TextField tfmes = new TextField();
    private TextField tfanio = new TextField();
    

    public Scene organizar() {
        registrar.setLayoutX(300);
        registrar.setLayoutY(375);
        po.setFont(Font.loadFont(font, 16));
        po.setFill(Color.WHITE);
        co.setFont(Font.loadFont(font, 16));
        co.setFill(Color.WHITE);
        gen.setFont(Font.loadFont(font, 16));
        gen.setFill(Color.WHITE);
        edad.setFont(Font.loadFont(font, 16));
        edad.setFill(Color.WHITE);
        anionac.setFont(Font.loadFont(font, 16));
        anionac.setFill(Color.WHITE);
        tipomov.setFont(Font.loadFont(font, 16));
        tipomov.setFill(Color.WHITE);
        viatrans.setFont(Font.loadFont(font, 16));
        viatrans.setFill(Color.WHITE);
        paisproc.setFont(Font.loadFont(font, 16));
        paisproc.setFill(Color.WHITE);
        paisdest.setFont(Font.loadFont(font, 16));
        paisdest.setFill(Color.WHITE);
        dia.setFont(Font.loadFont(font, 16));
        dia.setFill(Color.WHITE);
        mes.setFont(Font.loadFont(font, 16));
        mes.setFill(Color.WHITE);
        anio.setFont(Font.loadFont(font, 16));
        anio.setFill(Color.WHITE);
        
        
        agent.setLayoutX(70);
        agent.setLayoutY(100);
        
        label.setLayoutX(0);
        label.setLayoutY(25);
        
        
        po.setLayoutX(280);
        po.setLayoutY(125);
        co.setLayoutX(280);
        co.setLayoutY(163);
        gen.setLayoutX(280);
        gen.setLayoutY(200);
        
        edad.setLayoutX(557);
        edad.setLayoutY(123);
        anionac.setLayoutX(557);
        anionac.setLayoutY(163);
        
        
        
        tipomov.setLayoutX(17);
        tipomov.setLayoutY(282);
        viatrans.setLayoutX(17);
        viatrans.setLayoutY(320);
        
        paisproc.setLayoutX(280);
        paisproc.setLayoutY(282);
        paisdest.setLayoutX(280);
        paisdest.setLayoutY(320);
        
        dia.setLayoutX(557);
        dia.setLayoutY(282);
        mes.setLayoutX(557);
        mes.setLayoutY(320);
        anio.setLayoutX(557);
        anio.setLayoutY(357);
        
        
        
        
        tfpo.setLayoutX(375);
        tfpo.setLayoutY(100);
        tfco.setLayoutX(375);
        tfco.setLayoutY(140);
        tfgen.setLayoutX(375);
        tfgen.setLayoutY(180);
        
        tfedad.setLayoutX(625);
        tfedad.setLayoutY(100);
        tfanionac.setLayoutX(625);
        tfanionac.setLayoutY(140);
        
        
        
        tftipomov.setLayoutX(107);
        tftipomov.setLayoutY(257);
        tfviatrans.setLayoutX(107);
        tfviatrans.setLayoutY(297);
        
        tfpaisproc.setLayoutX(385);
        tfpaisproc.setLayoutY(257);
        tfpaisdest.setLayoutX(385);
        tfpaisdest.setLayoutY(297);
        
        tfdia.setLayoutX(625);
        tfdia.setLayoutY(257);
        tfmes.setLayoutX(625);
        tfmes.setLayoutY(297);
        tfanio.setLayoutX(625);
        tfanio.setLayoutY(337);
        
        
        
        
        root2.getChildren().addAll(registrar, label,po,tfpo,co,tfco,gen,tfgen,edad,tfedad,anionac,tfanionac
                ,tipomov,tftipomov,viatrans,tfviatrans,paisproc,tfpaisproc,paisdest,tfpaisdest,dia,tfdia,mes,tfmes,anio,tfanio,agent);
        root.getChildren().addAll(fondo, root2);
        return new Scene(root, 800, 450);
    }
    
}
