/*
 * La clase agente es la contiene el agente y su puesto de trabajo
 */
package empleados;

import turnos.Asignar;
import turnos.Turno;

/**
 *
 * @author roboto
 */
public class Agente {

    private int puesto;
    private Turno atencion;
    private boolean ocupado = false;

    //Se crea un agente con el puesto correspiente
    public Agente(int puesto) {
        this.puesto = puesto;
    }

    public boolean atender() {
        if (Asignar.getTurnos().isEmpty()) {
            return false;
        }
        atencion = Asignar.quitar();
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(puesto);
    }

    public Turno getTurno() {
        return atencion;
    }

    public int getPuesto() {
        return puesto;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setAtencion(Turno atencion) {
        this.atencion = atencion;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
    

}
