/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.*;

/**
 *
 * @author Fabricio Eduardo Placido Chambi 20221977-printConsola-[ultima Entrega]&&YANCE VALENZUELA Anthony 20224203[ultima Entrega] 
 */
public class PilaMienbrosMesa {

    public NodoMiembroMesa top;

    public PilaMienbrosMesa() {
        this.top = null;
    }

    public void push(MiembroMesa mienbroMesa) {
        NodoMiembroMesa newNodo = new NodoMiembroMesa(mienbroMesa);
        newNodo.setNext(top);
        top = newNodo;
    }

    public boolean buscarDNI(String nDNI) {
        NodoMiembroMesa ptr = top;
        while (ptr != null) {
            if (nDNI.equals(ptr.getMiebroMesa().getDni())) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public boolean buscarTipoMiembro(MiembroMesa mesa) {
        NodoMiembroMesa ptr = top;
        while (ptr != null) {
            if (mesa.getTipoMienbro().equals(ptr.getMiebroMesa().getTipoMienbro())) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public MiembroMesa buscarMienbro(String nDNI) {
        NodoMiembroMesa ptr = top;
        while (ptr != null) {
            if (nDNI.equals(ptr.getMiebroMesa().getDni())) {
                return ptr.getMiebroMesa();
            }
            ptr = ptr.getNext();
        }
        return null;
    }

    public MiembroMesa getMiembroPorTipo(String tipo) {
        NodoMiembroMesa ptr = top;
        while (ptr != null) {
            if (tipo.equals(ptr.getMiebroMesa().getTipoMienbro())) {
                return ptr.getMiebroMesa();
            }
            ptr = ptr.getNext();
        }
        return null;
    }

    public int size() {
        int cont = 0;
        NodoMiembroMesa ptr = top;
        while (ptr != null) {
            cont++;
            ptr = ptr.getNext();
        }
        return cont;
    }

    public void eliminarMiembro(String dni) {
        if (top == null) {
            return; // La pila está vacía
        }

        // Si el miembro a eliminar está en el tope de la pila
        if (top.getMiebroMesa().getDni().equals(dni)) {
            top = top.getNext();
            return;
        }
        // Buscar el miembro en la pila
        NodoMiembroMesa actual = top;
        while (actual.getNext() != null) {
            if (actual.getNext().getMiebroMesa().getDni().equals(dni)) {
                // Eliminar el nodo apuntando el actual al siguiente del que se eliminará
                actual.setNext(actual.getNext().getNext());
                return;
            }
            actual = actual.getNext();
        }
    }
    //Fabricio Eduardo Placido Chambi 20221977-printConsola-[ultima Entrega]
    public void printConsola() {
        NodoMiembroMesa ptr = top;
        if (ptr == null) {
            System.out.println("No hay miembros registrados en la mesa.");
            return;
        }
        //System.out.println("Miembros de la Mesa:");
        while (ptr != null) {
            MiembroMesa miembro = ptr.getMiebroMesa();
            System.out.println("Nombre: " + miembro.getNombre() + ", Apellido: " + miembro.getApellido()
                    + ", DNI: " + miembro.getDni() + ", Tipo: " + miembro.getTipoMienbro()
                    + ", Clave de Acceso: " + miembro.getClaveAcceso() + ", Firma: " + miembro.getFirma());
            ptr = ptr.getNext();
        }
    }
//YANCE VALENZUELA Anthony 20224203-printString-[ultima Entrega] 
    public String printString() {
        NodoMiembroMesa ptr = top;
        if (ptr == null) {
            return "No hay miembros registrados en la mesa.";
        }

        StringBuilder print = new StringBuilder(); // Usamos StringBuilder aquí
        print.append("--------------------------------------------------------------------------------------------\n");
        while (ptr != null) {
            MiembroMesa miembro = ptr.getMiebroMesa();
            print.append("Nombre: ").append(miembro.getNombre())
                    .append(", Apellido: ").append(miembro.getApellido())
                    .append(", DNI: ").append(miembro.getDni())
                    .append(", Tipo: ").append(miembro.getTipoMienbro())
                    .append(", Clave de Acceso: ").append(miembro.getClaveAcceso())
                    .append(", Firma: ").append(miembro.getFirma()).append("\n");
            ptr = ptr.getNext();
        }
        print.append("--------------------------------------------------------------------------------------------");
        return print.toString(); // Devuelves la cadena construida
    }

}
