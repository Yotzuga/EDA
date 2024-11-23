/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.MesaElectoral;

/**
 *
 * @author //[Terminado]
 */

public class NodoMesaElectoral {

    private NodoMesaElectoral next;
    private MesaElectoral mesaElectoral;

    public NodoMesaElectoral(MesaElectoral mesaElectoral) {
        this.next = null;
        this.mesaElectoral = mesaElectoral;
    }

    public NodoMesaElectoral getNext() {
        return next;
    }

    public void setNext(NodoMesaElectoral next) {
        this.next = next;
    }

    public MesaElectoral getMesaElectoral() {
        return mesaElectoral;
    }

    public void setMesaElectoral(MesaElectoral mesaElectoral) {
        this.mesaElectoral = mesaElectoral;
    }   
   
}
