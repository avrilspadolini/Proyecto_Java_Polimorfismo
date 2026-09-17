/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class Sensor {
    private String codigo;
    private String tipo;
    private double alcance;
    private String estado;
    
    public Sensor (String codigo, String tipo, double alcance, String estado){
        this.codigo = codigo;
        this.tipo = tipo;
        this.alcance = alcance;
        this.estado = estado;
    }
    
    public void mostrarInfo(){
        System.out.println("Sensor: " + codigo + " Tipo: "+ tipo + " Alcance: "+ alcance+ " Estado: "+ estado);
    }
        
}
