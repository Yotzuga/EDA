/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author[Terminado]
 */
public class ListaOperadores {

    public NodOperador L;

    public ListaOperadores() {     
        this.L = null;       
    }

    private boolean vacia() {
        return L == null;
    }

    public void añadirFinal(NodOperador newNodo) {
        if (vacia()) {          
            L = newNodo;
            return;
        }
        NodOperador ptr = L;
        while (ptr.getNext() != null) {
            ptr = ptr.getNext();
        }
        ptr.setNext(newNodo);
    }

    public boolean buscarPorClave(String clave) {
        NodOperador ptr = L;
        while (ptr != null) {
            if (clave.equals(ptr.getClave())) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public NodOperador returnNodo(String clave) {
        NodOperador ptr = L;
        while (ptr != null) {
            if (clave.equals(ptr.getClave())) {
                return ptr;
            }
            ptr = ptr.getNext();
        }
        return null;
    }
}
