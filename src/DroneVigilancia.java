/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */

public class DroneVigilancia extends Drone{
    private double velocidadmax; 
    private int cantcamaras;
    private boolean visionnocturna;
    private double alcancetransmision;
    private Operador operador; //Asociacion : no va en el constructor, se asigna con setter.
    
    public DroneVigilancia(String Id, double autonomiaVuelo, Bateria bateria, GPS gps, double velocidadmax, int cantcamaras, boolean visionnocturna, double alcancetransmision){
        super(Id, autonomiaVuelo, bateria, gps);
        this.velocidadmax = velocidadmax;
        this.cantcamaras = cantcamaras;
        this.visionnocturna = visionnocturna;
        this.alcancetransmision = alcancetransmision;
        
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }
    
    public void infoDroneV(){
        System.out.println("Tipo de drone: Vigilancia");
        mostrarDatos();
        System.out.println("Velocidad maxima: " + velocidadmax);
        System.out.println("Cantidad de camaras: " + cantcamaras);
        if (visionnocturna){
            System.out.println("Vision nocturna: SI ");
        }else{
            System.out.println("Vision nocturna: NO ");
        }
       System.out.println("Alcance de transmision: " + alcancetransmision);
       
       if (operador != null){
           System.out.println("Operador: " + operador.getNombre()+ " " + operador.getApellido());
       }else{
           System.out.println("No posee un Operador asignado");
       }
    }
    
    @Override
    public void IniciarMision(){
        System.out.println("DRONE VIGILANCIA");
        System.out.println("Activando CAMARAS");
        System.out.println("Iniciando MONITOREO");
        System.out.println("Comenzando TRANSMISION");
         
    }
    
    @Override
    public double calcularConsumo(){
        return cantcamaras * 8.0 + alcancetransmision * 2;
    }
    
    
}

