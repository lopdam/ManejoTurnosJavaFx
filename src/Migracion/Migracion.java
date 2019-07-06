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

    public static void agregarRegistro(Migracion migra) {
        registroMigratorios.add(migra);
    }

    public String toString() {
        String s = "";
        s += tipoMov + "," + viaTransporte + "," + fechaMovilizacion + "," + fechaRegistro + "," + paisProc + "," + paisDestino;
        return s;
    }

}
