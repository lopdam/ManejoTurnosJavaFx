/*
 * El adminin puede crear y eliminar agentes 
 */
package empleados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roboto
 */
public class Admin {

    private static List<Agente> agentes = new LinkedList<>();

    public static boolean agregarAgente(int puesto) {
        Agente agente = new Agente(puesto);

        Iterator<Agente> it = agentes.iterator();

        while (it.hasNext()) {
            if (it.next().getPuesto() == puesto) {
                return false;
            }
        }

        agentes.add(agente);
        return true;
    }

    public static boolean removerAgente(int puesto) {

        Iterator<Agente> it = agentes.iterator();
        while (it.hasNext()) {
            Agente tmp = it.next();
            if (tmp.getPuesto() == puesto) {

                return agentes.remove(it);
            }
        }

        return false;
    }

    public List<Agente> getAgentes() {
        return agentes;
    }

}
