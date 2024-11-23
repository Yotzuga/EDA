/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.Candidato;

/**
 *
 * @author [Terminado]

 */
public class NodoCandidatos {
    private NodoCandidatos next;
    private Candidato candidato;

    public NodoCandidatos(Candidato candidato) {
        this.next = null;
        this.candidato = candidato;
    }

    public NodoCandidatos getNext() {
        return next;
    }

    public void setNext(NodoCandidatos next) {
        this.next = next;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
      
}
