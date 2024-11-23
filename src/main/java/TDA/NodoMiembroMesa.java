/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.MiembroMesa;

/**
 *
 * @author [Terminado]
 */
public class NodoMiembroMesa {
    private NodoMiembroMesa next;
    private MiembroMesa miebroMesa;

    public NodoMiembroMesa(MiembroMesa miebroMesa) {
        this.miebroMesa = miebroMesa;
        this.next = null;
    }

    public NodoMiembroMesa getNext() {
        return next;
    }

    public void setNext(NodoMiembroMesa next) {
        this.next = next;
    }

    public MiembroMesa getMiebroMesa() {
        return miebroMesa;
    }

    public void setMiebroMesa(MiembroMesa miebroMesa) {
        this.miebroMesa = miebroMesa;
    }
       
}
