/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sebastián Montenegro Carrillo 20223756 [ultima Entrega]
 */
public class Elecciones {
    private String fecha;
    private String tipoEleccion; //

    public Elecciones(String fecha, String tipoEleccion) {
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }  
}
