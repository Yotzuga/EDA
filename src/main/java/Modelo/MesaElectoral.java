/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import TDA.*;
//
/**
 *
 * @author [Terminado]
 */
public class MesaElectoral {

    private ActaElectoral actaElectoral;
    public  String nMesa;
    private PilaMienbrosMesa pilaMiebros;

    public MesaElectoral(String nMesa) {
        this.nMesa = nMesa;
        this.pilaMiebros = new PilaMienbrosMesa();
        this.actaElectoral = null;
    }

    
    public String getnMesa() {
        return nMesa;
    }

    public void setnMesa(String nMesa) {
        this.nMesa = nMesa;
    }

    public PilaMienbrosMesa getPilaMiebros() {
        return pilaMiebros;
    }

    public void setPilaMiebros(PilaMienbrosMesa pilaMiebros) {
        this.pilaMiebros = pilaMiebros;
    }
    
    public ActaElectoral getActaElectoral() {
        return actaElectoral;
    }

    public void setActaElectoral(ActaElectoral actaElectoral) {
        this.actaElectoral = actaElectoral;
    }
      

    public boolean puedeAgregarMiembro() {
        return pilaMiebros.size() < 3; // Suponiendo que size() devuelve el tamaño de la pila
    }

    public void agregarMiembro(MiembroMesa miembro) {
        if (puedeAgregarMiembro()) {
            pilaMiebros.push(miembro);
        } else {
            System.out.println("Límite de miembros alcanzado para esta mesa.");
        }
    }
    
    @Override
    public String toString() {
        return "MesaElectoral{" + "actaElectoral=" + actaElectoral + ", nMesa=" + nMesa + ", pilaMiebros=" + pilaMiebros + '}';
    }

}
