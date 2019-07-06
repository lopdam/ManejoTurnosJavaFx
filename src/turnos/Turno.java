package turnos;

import java.util.List;

/**
 *
 * @author lopdam
 */
public class Turno {

    private static int turnos = 0;

    //La prioridad de los turnos se establese dependieno la condicion del migrante.
    /*
    Capacidades Especiales=1
    Tercera Edad=2
    Atencion Normal=3
     */
    private String tipo;
    private int prioridad;

    //Combinacion de letras y numero
    private String id;
    
    private static final String[] letra={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","V","W","X","Y","Z"};
    
    //Creamos un turno y sumos +1 a los turnos para conoce los turnos hasta ese momneto
    public Turno(int prioridad) {
        turnos++;
        this.prioridad = prioridad;

        switch (prioridad) {
            case 1:
                this.tipo = "Capacidades Especiales";
                break;
            case 2:
                this.tipo = "Tercera Edad";
                break;
            case 3:
                this.tipo = "Atencion Normal";
                break;

        }
        
        //Asignar id
        int codigoLetra=turnos%letra.length;
        

    }

}
