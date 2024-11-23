/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.ActaElectoral;
import Modelo.MesaElectoral;

/**
 *
 * @author YANCE VALENZUELA Anthony 20224203[ultima Entrega] && Cristian Erazo Mena 20220884[ultima Entrega]
 */
public class ListaMesasElectoral {

    public NodoMesaElectoral L;

    public ListaMesasElectoral() {
        this.L = null;
    }

    public NodoMesaElectoral getL() {
        return L;
    }   

    public boolean vacia() {
        return L == null;
    }

    public void AñadirFinal(MesaElectoral mesa) {
        if (vacia() == true) {
            L = new NodoMesaElectoral(mesa);
            return;
        }
        NodoMesaElectoral ptr = L;
        while (ptr.getNext() != null) {
            ptr = ptr.getNext();
        }
        NodoMesaElectoral newNodo = new NodoMesaElectoral(mesa);
        ptr.setNext(newNodo);
        newNodo.setNext(null);
    }

    public void elimanarMesaElectoral(String nMesa) {
        NodoMesaElectoral ptr = L;
        NodoMesaElectoral anterior = L;
        int p = 0;
        while (ptr != null) {
            if (nMesa.equals(ptr.getMesaElectoral().getnMesa())) {
                if (p == 0) {
                    L = ptr.getNext();
                } else {
                    anterior.setNext(ptr.getNext());
                }
                break;
            }
            anterior = ptr;
            ptr = ptr.getNext();
            p++;
        }
    }

    public boolean buscarNumeraMesa(String nMesa) {
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            if (nMesa.equals(ptr.getMesaElectoral().getnMesa())) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public NodoMesaElectoral returnNodo(String nMesa) {
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            if (nMesa.equals(ptr.getMesaElectoral().getnMesa())) {
                return ptr;
            }
            ptr = ptr.getNext();
        }
        return null;
    }

    public MesaElectoral returnMesa(String nMesa) {
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            if (nMesa.equals(ptr.getMesaElectoral().getnMesa())) {
                return ptr.getMesaElectoral();
            }
            ptr = ptr.getNext();
        }
        return null;
    }

    public void modificarMesaElectoral(String nMesa, String newNumeroMesa) {
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            if (nMesa.equals(ptr.getMesaElectoral().getnMesa())) {
                ptr.getMesaElectoral().setnMesa(newNumeroMesa);
            }
            ptr = ptr.getNext();
        }
    }

    
//Cristian Erazo Mena 20220884-ContarVotosRegistrados-[ultima Entrega]
    public int ContarVotosRegistrados() {
        int VotosRegistrados = 0;
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            ActaElectoral acta = ptr.getMesaElectoral().getActaElectoral();
            VotosRegistrados = VotosRegistrados + acta.getVotantesRegistradosAc();
            ptr = ptr.getNext();
        }
        return VotosRegistrados;
    }
//Cristian Erazo Mena 20220884-ContarVotosTotales-[ultima Entrega]
    public int ContarVotosTotales() {
        int TotalVotos = 0;
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            ActaElectoral acta = ptr.getMesaElectoral().getActaElectoral();
            TotalVotos = TotalVotos + acta.getVotoTotal();
            ptr = ptr.getNext();
        }
        return TotalVotos;
    }
   //YANCE VALENZUELA Anthony 20224203-ContarVotosNulos-[ultima Entrega] 
    public int ContarVotosNulos() {
        int VotosNulos = 0;
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            ActaElectoral acta = ptr.getMesaElectoral().getActaElectoral();
            VotosNulos = VotosNulos + acta.getVotoNulo();
            ptr = ptr.getNext();
        }
        return VotosNulos;
    }
   //YANCE VALENZUELA Anthony 20224203-ContarVotosBlancos-[ultima Entrega] 
    public int ContarVotosBlancos() {
        int VotosBlancos = 0;
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            ActaElectoral acta = ptr.getMesaElectoral().getActaElectoral();
            VotosBlancos = VotosBlancos + acta.getVotoBlanco();
            ptr = ptr.getNext();
        }
        return VotosBlancos;
    }
   //YANCE VALENZUELA Anthony 20224203-ContarVotosTotalCandidato-[ultima Entrega] 
    public int ContarVotosTotalCandidato(String Nombre) {
        int VotosCandidato = 0;
        NodoMesaElectoral ptr = L;
        while (ptr != null) {
            NodoCandidatos ptrCandidato = ptr.getMesaElectoral().getActaElectoral().getColaCandidatos().front;
            if (Nombre.equals(ptrCandidato.getCandidato().getNombre())) {
                VotosCandidato = VotosCandidato + ptrCandidato.getCandidato().getVotos();
            }
            ptr = ptr.getNext();
        }
        return VotosCandidato;
    }

}
