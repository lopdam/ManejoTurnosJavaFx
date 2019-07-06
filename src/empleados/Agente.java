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

}