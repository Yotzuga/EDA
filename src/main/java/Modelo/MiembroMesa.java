/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author [Terminado]
 */
public class MiembroMesa {
    private String nombre;
    private String apellido;
    private String dni;
    private String tipoMienbro; 
    private String claveAcceso;
    private String firma;

    public MiembroMesa(String nombre, String apellido, String dni, String tipoMienbro, String claveAcceso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoMienbro = tipoMienbro;
        this.claveAcceso = claveAcceso;
        this.firma = nombre+"-"+dni; 
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoMienbro() {
        return tipoMienbro;
    }

    public void setTipoMienbro(String tipoMienbro) {
        this.tipoMienbro = tipoMienbro;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }   
    
}
