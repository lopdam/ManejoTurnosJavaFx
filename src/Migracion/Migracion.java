/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Migracion;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Odalys
 */
public class Migracion {

    private String tipoMov;
    private String viaTransporte;
    private Date fechaMovilizacion;
    private Date fechaRegistro;
    private String paisProc;
    private String paisDestino;
    private Migrante migrante;

    private static List<Migracion> registroMigratorios = new LinkedList<Migracion>();

    public Migracion(String tipoMov, String viaTransporte, Date fechaMovilizacion, Date fechaRegistro, String paisProc, String paisDestino, Migrante migrante) {
        this.tipoMov = tipoMov;
        this.viaTransporte = viaTransporte;
        this.fechaMovilizacion = fechaMovilizacion;
        this.fechaRegistro = fechaRegistro;
        this.paisProc = paisProc;
        this.paisDestino = paisDestino;
        this.migrante = migrante;
    }

    public static List<Migracion> getRegistroMigratorios() {
        return registroMigratorios;
    }

    //solamente al momento de leer
    public static void agregarLeer(Migracion migra) {
        registroMigratorios.add(migra);
    }

    //Esta sirve cuando solamente se registra
    public static void agregarMigracion(Migracion migra) {
        registroMigratorios.add(migra);
        ReaderWriter.writerRegistrosM();
    }

    public String toString() {
        String s = "";
        s += tipoMov + "," + viaTransporte + "," + fechaMovilizacion.toString() + "," + fechaRegistro + "," + paisProc + "," + paisDestino + "," + migrante.toString();
        return s;
    }
    //entrada,avion,21/07/2019,07/07/2019,Ecuador,EstadosUnidos,Guayas,Guayaquil,femenino,09/08/2000,18

}
