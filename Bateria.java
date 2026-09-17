/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class Bateria {
    private double capacidadmax;
    private double porcentajeact;
    private double tiempocarga;
    private String estadodesgaste;
    
    public Bateria(double capacidadmax, double porcentajeact, double tiempocarga, String estadodesgaste){
        this.capacidadmax = capacidadmax;
        this.porcentajeact = porcentajeact;
        this.tiempocarga = tiempocarga;
        this.estadodesgaste = estadodesgaste;
    }

    public double getPorcentajeact() {
        return porcentajeact;
    }

    public void setPorcentajeact(double porcentajeact) {
        this.porcentajeact = porcentajeact;
    }

    
    
}
