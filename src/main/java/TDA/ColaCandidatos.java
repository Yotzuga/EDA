/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.*;

/**
 *
 * @author Fabricio Eduardo Placido Chambi 20221977[ultima Entrega] && YANCE VALENZUELA Anthony 20224203[ultima Entrega]
 *
 */
public class ColaCandidatos {

    public NodoCandidatos front;
    public NodoCandidatos rear;

    public ColaCandidatos() {
        this.front = null;
        this.rear = null;
    }

    public NodoCandidatos getFront() {
        return front;
    }

    //resetea la colageneral para cada acta
    public ColaCandidatos colaEncero() {
        ColaCandidatos colaCero = new ColaCandidatos();
        NodoCandidatos ptr = front;

        while (ptr != null) {
            if (ptr.getCandidato().getVotos() >= 0) {
                Candidato candidatoInsertar = new Candidato(ptr.getCandidato().getNombre(), ptr.getCandidato().getApellido(), ptr.getCandidato().getDni(), ptr.getCandidato().getPartidoPolitico());
                colaCero.inserta(candidatoInsertar);
            }
            ptr = ptr.getNext();
        }
        return colaCero;
    }

    public void inserta(Candidato candidato) {
        /*Incertar al final de la cola "normal" */
        NodoCandidatos nodo = new NodoCandidatos(candidato);
        if (rear == null) {// si el nodo_final (rear) apunta a nulo
            front = nodo; // ambos nodos apuntan a new_nodo
            rear = nodo;
        } else {
            rear.setNext(nodo);// el sgte nodo es new_nodo
            rear = nodo;// y rear apunta a nodo
        }
    }

    public boolean buscarNombre(String Nombre) {
        NodoCandidatos ptr = front;
        while (ptr != null) {
            if (Nombre.equals(ptr.getCandidato().getNombre())) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public Candidato returnCandidato_Nombre(String Nombre) {
        NodoCandidatos ptr = front;
        while (ptr != null) {
            if (Nombre.equals(ptr.getCandidato().getNombre())) {
                return ptr.getCandidato();
            }
            ptr = ptr.getNext();
        }
        return null;
    }

    public boolean buscarDNI(String nDNI) {
        NodoCandidatos ptr = front;
        while (ptr != null) {
            if (nDNI.equals(ptr.getCandidato().getDni())) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public Candidato returnCandidato_DNI(String nDNI) {
        NodoCandidatos ptr = front;
        while (ptr != null) {
            if (nDNI.equals(ptr.getCandidato().getDni())) {
                return ptr.getCandidato();
            }
            ptr = ptr.getNext();
        }
        return null;
    }


    public int contarColaCandidatos() {
        NodoCandidatos ptr = front;
        int c = 0;
        while (ptr != null) {
            c++;
            ptr = ptr.getNext();
        }
        return c;
    }

    public void eliminarCandidatos(String dni) {
        if (front == null) {
            return; // La cola está vacía
        }

        // Si el candidato a eliminar está en el primer nodo (front)
        if (front.getCandidato().getDni().equals(dni)) {
            front = front.getNext(); // Se mueve el puntero front al siguiente nodo
            return;
        }

        // Buscar el candidato en el resto de la cola
        NodoCandidatos actual = front;
        NodoCandidatos anterior = null;

        while (actual != null) {
            // Compara el dni del candidato en el nodo actual con el dni buscado
            if (actual.getCandidato().getDni().equals(dni)) {
                // Enlazar el nodo anterior al siguiente, eliminando el nodo actual
                if (anterior != null) {
                    anterior.setNext(actual.getNext());
                }
                return; // Candidato eliminado
            }
            anterior = actual; // Mover el puntero anterior al actual
            actual = actual.getNext(); // Mover al siguiente nodo
        }
    }
//Fabricio Eduardo Placido Chambi 20221977-printConsola-[ultima Entrega]
    public void printConsola() {
        NodoCandidatos ptr = front;
        if (ptr == null) {
            System.out.println("La cola de candidatos está vacía.");
            return;
        }
        System.out.println("Candidatos registrados:");
        while (ptr != null) {
            Candidato candidato = ptr.getCandidato();
            System.out.println("Nombre: " + candidato.getNombre() + ", Apellido: " + candidato.getApellido()
                    + ", DNI: " + candidato.getDni() + ", Partido: " + candidato.getPartidoPolitico()
                    + ", Votos: " + candidato.getVotos());
            ptr = ptr.getNext();
        }
    }
//YANCE VALENZUELA Anthony 20224203-printString-[ultima Entrega]
    public String printString() {
        NodoCandidatos ptr = front;
        if (ptr == null) {
            return "La cola de candidatos está vacía.";
        }

        // Usamos StringBuilder para construir la salida
        StringBuilder print = new StringBuilder();
        print.append("--------------------------------------------------------------------------------------------\n");
        print.append("Candidatos registrados:\n");

        while (ptr != null) {
            Candidato candidato = ptr.getCandidato();
            print.append("Nombre: ").append(candidato.getNombre())
                    .append(", Apellido: ").append(candidato.getApellido())
                    .append(", DNI: ").append(candidato.getDni())
                    .append(", Partido: ").append(candidato.getPartidoPolitico())
                    .append(", Votos: ").append(candidato.getVotos()).append("\n");
            ptr = ptr.getNext();
        }

        // Devuelve la salida como un String
        return print.toString();
    }

}
