/*
 * Esta clase nos permite asiganar a la cola los turnos y permite extraer dependiendo la prioridad
 */
package turnos;

import java.util.PriorityQueue;

/**
 *
 * @author roboto
 */
public class Asignar {

    private static PriorityQueue<Turno> turnos = new PriorityQueue<Turno>((Turno o1, Turno o2) -> o1.getPrioridad() - o2.getPrioridad());

    //Agregamos los turnos a la cola
    public static boolean agregraTurno(int i) {

        if (i < 1 || i > 3) {
            return false;
        }
        turnos.offer(new Turno(i));

        return true;
    }

    //quitamos el turno de la cola dependieno de la prioridad
    public static Turno quitar() {

        return turnos.poll();
    }

    public static PriorityQueue<Turno> getTurnos() {
        return turnos;
    }

}
