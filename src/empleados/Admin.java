/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roboto
 */
public class Admin {

    public static List<Agente> agentes = new LinkedList<>();
    
    public static boolean agregarAgente(int puesto){
        Agente agente=new Agente(puesto);
        
        
        if(agentes.contains(agente)){
        return false;
        }
        
        agentes.add(agente);
        return true;
    }
    
    public static boolean removerAgente(int puesto){
    
        return true;
    }

}
