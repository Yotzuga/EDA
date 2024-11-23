/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import TDA.*;

/**
 *
 * @author [Terminado]
 */
public class ActaElectoral {

    private String titulo;//tituloDocumento
    private String nMesa;//Numero de mesa
    private String fecha;//fechaHora
    private int votantesRegistradosAc; // registrados en el Acta
    private ColaCandidatos colaCandidatos;

    private int votoBlanco;
    private int votoNulo;
    private int votoTotal; //votantes que fueron a las hurnas

    private String obs; //Observacion
    private String sello;//selloOficial Mienbros de mesa.

    public ActaElectoral(String titulo, String nMesa, String fecha, int votantesRegistradosAc) {
        this.titulo = titulo;
        this.nMesa = nMesa;
        this.fecha = fecha;
        this.votantesRegistradosAc = votantesRegistradosAc;
        this.votoBlanco = 0;
        this.votoNulo = 0;
        this.votoTotal = 0;
        this.obs = "";
        this.sello = "";
        this.colaCandidatos = new ColaCandidatos();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getnMesa() {
        return nMesa;
    }

    public void setnMesa(String nMesa) {
        this.nMesa = nMesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getVotantesRegistradosAc() {
        return votantesRegistradosAc;
    }

    public void setVotantesRegistradosAc(int votantesRegistradosAc) {
        this.votantesRegistradosAc = votantesRegistradosAc;
    }

    public int getVotoBlanco() {
        return votoBlanco;
    }

    public void setVotoBlanco(int votoBlanco) {
        this.votoBlanco = votoBlanco;
    }

    public int getVotoNulo() {
        return votoNulo;
    }

    public void setVotoNulo(int votoNulo) {
        this.votoNulo = votoNulo;
    }

    public int getVotoTotal() {
        return votoTotal;
    }

    public void setVotoTotal(int votoTotal) {
        this.votoTotal = votoTotal;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public ColaCandidatos getColaCandidatos() {
        return colaCandidatos;
    }

    public void setColaCandidatos(ColaCandidatos colaCandidatos) {
        this.colaCandidatos = colaCandidatos;
    }

    @Override
    public String toString() {
        return "ActaElectoral{" + "titulo=" + titulo + ", nMesa=" + nMesa + ", fecha=" + fecha + ", votantesRegistradosAc=" + votantesRegistradosAc + ", votoBlanco=" + votoBlanco + ", votoNulo=" + votoNulo + ", votoTotal=" + votoTotal + ", obs=" + obs + ", sello=" + sello + ", colaCandidatos=" + colaCandidatos + '}';
    }

}
