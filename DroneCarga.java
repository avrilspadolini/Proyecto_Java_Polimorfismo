/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class DroneCarga extends Drone{
    private double pesomax;
    private String tipocarga;
    private double tempalmacenamiento;
    private double velocidadmax;
    private String codigolog;
    
    public DroneCarga(String Id, double autonomiaVuelo, Bateria bateria, GPS gps, double pesomax, String tipocarga, double tempalmacenamiento, double velocidadmax, String codigolog){
        super(Id, autonomiaVuelo, bateria, gps);
        this.pesomax = pesomax;
        this.tipocarga = tipocarga;
        this.tempalmacenamiento = tempalmacenamiento;
        this.velocidadmax = velocidadmax;
        this.codigolog = codigolog;
    }
    
    public void infoDroneC(){
        System.out.println("Tipo de drone: Carga");
        mostrarDatos();
        System.out.println("Peso Maximo: " + pesomax);
        System.out.println("Tipo de carga: "+ tipocarga);
        System.out.println("Temperatura de almacenamiento: "+ tempalmacenamiento);
        System.out.println("Velocidad maxima: " + velocidadmax);
        System.out.println("Codigo logistico: "+ codigolog);
    }
    
    @Override
    public void IniciarMision(){
        System.out.println("DRONE CARGA");
        System.out.println("Verificando carga asignada");
        System.out.println("Controlando condiciones de transporte");
        System.out.println("Iniciando recorrido");
         
    }
    
    @Override
    public double calcularConsumo(){
        return pesomax * 5.0;
    }
}
