/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package migracion;

import java.time.LocalDate;
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
    private LocalDate fechaMovilizacion;
    private LocalDate fechaRegistro;
    private String paisProc;
    private String paisDestino;
    private Migrante migrante;

    private static List<Migracion> registroMigratorios = new LinkedList<Migracion>();

    public Migracion(String tipoMov, String viaTransporte, LocalDate fechaMovilizacion, LocalDate fechaRegistro, String paisProc, String paisDestino, Migrante migrante) {
        this.tipoMov = tipoMov;
        this.viaTransporte = viaTransporte;
        this.fechaMovilizacion = fechaMovilizacion;
        this.fechaRegistro = fechaRegistro;
        this.paisProc = paisProc;
        this.paisDestino = paisDestino;
        this.migrante = migrante;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public LocalDate getFechaMovilizacion() {
        return fechaMovilizacion;
    }

    public void setFechaMovilizacion(LocalDate fechaMovilizacion) {
        this.fechaMovilizacion = fechaMovilizacion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getPaisProc() {
        return paisProc;
    }

    public void setPaisProc(String paisProc) {
        this.paisProc = paisProc;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Migrante getMigrante() {
        return migrante;
    }

    public void setMigrante(Migrante migrante) {
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
    public static boolean agregarMigracion(Migracion migra) {
        if (migra == null) {
            return false;
        }
        registroMigratorios.add(migra);
        ReaderWriter.writerRegistrosM();
        return true;
    }

    public static boolean UpDate() {
        ReaderWriter.writerRegistrosM();
        return true;
    }

    public String toString() {
        String s = "";
        s += tipoMov + "," + viaTransporte + "," + fechaMovilizacion.toString() + "," + fechaRegistro + "," + paisProc + "," + paisDestino + "," + migrante.toString();
        return s;
    }
    //entrada,avion,21/07/2019,07/07/2019,Ecuador,EstadosUnidos,Guayas,Guayaquil,femenino,09/08/2000,18

}
