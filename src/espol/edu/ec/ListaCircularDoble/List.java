/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.ListaCircularDoble;

/**
 *
 * @author User-pc
 */
public interface List<E>{
    boolean addFirst(E element);
    boolean addLast(E element);
    boolean isEmpty();
    int size();
    
}


