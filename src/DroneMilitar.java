/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class DroneMilitar extends Drone{
    private int nivelBlindaje;
    private double alcanceOp;
    private boolean sistemaCam;
    private String capacidadTact;
    private double autonomiaMision;
    
    public DroneMilitar (String Id, double autonomiaVuelo, Bateria bateria, GPS gps, int nivelBlindaje, double alcanceOp, boolean sistemaCam, String capacidadTact, double autonomiaMision){
        super(Id, autonomiaVuelo, bateria, gps);      
        this.nivelBlindaje = nivelBlindaje;
        this.alcanceOp = alcanceOp;
        this.sistemaCam = sistemaCam;
        this.capacidadTact = capacidadTact;
        this.autonomiaMision = autonomiaMision;
    }
    
    @Override
    public void IniciarMision(){
        System.out.println("DRONE MILITAR");
        System.out.println("Activando SISTEMAS ESPECIALES");
        System.out.println("Verificando condiciones operativas");
    }
    
    @Override
    public double calcularConsumo(){
        return nivelBlindaje * 3.00 + alcanceOp * 0.5;
    }
}
