/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author David Eduardo Vilela Rivera 20222786-NodOperador-[ultima Entrega]
 */
public class NodOperador {
    private NodOperador next;    
    private String clave;
    private String usuario;

    public NodOperador(String clave, String usuario) {
        this.next = null;
        this.clave = clave;
        this.usuario = usuario;
    }

    public NodOperador getNext() {
        return next;
    }

    public void setNext(NodOperador next) {
        this.next = next;
    }

    public String getClave() {
        return clave;
    }

    public String getUsuario() {
        return usuario;
    }
}

