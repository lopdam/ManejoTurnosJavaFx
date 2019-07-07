/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.ListaCircularDoble;

import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author User-pc
 */
public class ListaCircular <E> implements List<E>, Iterable<E> {

    private Node<E> last;
    private int efectivo;

    public ListaCircular() {
        efectivo = 0;
        last = null;
    }

    @Override
    public boolean addFirst(E element) {
        if (element == null) {
            return false;
        }
        Node<E> n = new Node<>(element);
        if (isEmpty()) {
            last = n;
            last.setNext(n);
            last.setPrevious(n);
        } else {
            n.setNext(last.getNext());
            n.setPrevious(last);
            last.getNext().setPrevious(n);
            last.setNext(n);
        }
        efectivo++;
        return true;
    }

    @Override
    public boolean addLast(E element) {
        if (element == null) {
            return false;
        }
        Node<E> nodo = new Node<>(element);
        if (isEmpty()) {
            last = nodo;
            last.setNext(nodo);
            last.setPrevious(nodo);
        } else {
            nodo.setNext(last.getNext());
            nodo.setPrevious(last);
            last.getNext().setPrevious(nodo);
            last.setNext(nodo);
            last = nodo;
        }

        efectivo++;
        return true;
    }

   
   
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public int size() {
        return efectivo;
    }


  

    @Override
    public Iterator<E> iterator() {
        return null;      
    }
    
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> it = new ListIterator<E>() {
            private Node<E> p = getNode(index);
            private int IndiceA = index;
                    
            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public E next() {
                E data = p.getData();
                p = p.getNext();
                if(IndiceA == efectivo-1)
                    IndiceA = 0;
                else
                    IndiceA++;
                return data;
            }

            @Override
            public boolean hasPrevious() {
                return p != null;
            }

            @Override
            public E previous() {
                E data = p.getData();
                p = p.getPrevious();
                if(IndiceA == 0)
                    IndiceA = efectivo - 1;
                else
                    IndiceA--;
                return data;
            }

            @Override
            public int nextIndex() {
                if(IndiceA == efectivo - 1)
                    return 0;
                return IndiceA+1;
            }

            @Override
            public int previousIndex() {
                if(IndiceA == 0)
                    return efectivo - 1;
                return IndiceA-1;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void set(E e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void add(E e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
        return it;
    }
    
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    private Node<E> getNode(int index) {
        if(isEmpty()) return null;
        if (index == 0) {
            return last.getNext();
        }else if(last.getNext() != last){
            int cont = 1;
            Node<E> j = last.getNext().getNext();
            do{
                if (cont == index) {
                    return j;
                }
                cont++;
                j = j.getNext();
            }while(j != last.getNext().getNext());
        }
        return null;
    }
}



