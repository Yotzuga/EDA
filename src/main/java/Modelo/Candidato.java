/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
//
/**
 *
 * @author [Terminado]
 */
public class Candidato {
    private String nombre;
    private String apellido;
    private String dni;
    private String partidoPolitico;
    private int votos;

    public Candidato(String nombre, String apellido, String dni, String partidoPolitico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
        this.votos = 0;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
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

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    } 

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", partidoPolitico=" + partidoPolitico + ", votos=" + votos + '}';
    }    
}
