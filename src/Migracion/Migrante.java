/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Migracion;

import java.util.Date;

/**
 *
 * @author Odalys
 */
public class Migrante {

    private String provOrg;
    private String cantonOrg;
    private String sexo;
    private Date fecNac;
    private int edad;

    public Migrante(String provOrg, String cantonOrg, String sexo, Date fecNac, int edad) {
        this.provOrg = provOrg;
        this.cantonOrg = cantonOrg;
        this.sexo = sexo;
        this.fecNac = fecNac;
        this.edad = edad;
    }

    public String getProvOrg() {
        return provOrg;
    }

    public void setProvOrg(String provOrg) {
        this.provOrg = provOrg;
    }

    public String getCantonOrg() {
        return cantonOrg;
    }

    public void setCantonOrg(String cantonOrg) {
        this.cantonOrg = cantonOrg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Guayas,Guayaquil,femenino,09/08/2000,18
    @Override
    public String toString() {
        return provOrg+","+cantonOrg+","+sexo+","+fecNac.toString()+","+edad;
    }
}
