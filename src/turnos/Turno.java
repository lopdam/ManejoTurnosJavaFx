package turnos;

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
    //numero de turno
    private int numTurno;
    
    private static final String[] letras={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","V","W","X","Y","Z"};
    
    //numero maximo por letra
    private static final int max=100;
    
    
    //Creamos un turno y sumos +1 a los turnos para conoce los turnos hasta ese momneto
    public Turno(int prioridad) {
        
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
        int codigoLetra=turnos/max;
        
        int codigoNum=turnos%max;
        
        this.id=(codigoNum>=10)?letras[codigoLetra]+codigoNum:letras[codigoLetra]+"0"+codigoNum;
        turnos++;
        this.numTurno=turnos;
    }

    public static int getTurnos() {
        return turnos;
    }
    public int getnumTurno() {
        return numTurno;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String toString(){
    return id;
    }
    

}
