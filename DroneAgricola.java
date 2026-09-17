
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class DroneAgricola extends Drone{   
    private double capacidadtanque;
    private String tipopesticida;
    private double areacubierta;
    private double nivelliquido;
    private ArrayList<Sensor> sensores = new ArrayList<>();
    
    
    public DroneAgricola(String Id, double autonomiaVuelo, Bateria bateria, GPS gps, double capacidadtanque, String tipopesticida, double areacubierta, double nivelliquido){
        super(Id, autonomiaVuelo, bateria, gps);
        this.capacidadtanque = capacidadtanque;
        this.tipopesticida = tipopesticida;
        this.areacubierta = areacubierta;
        this.nivelliquido = nivelliquido;
}
    
    public void infoDroneA(){
        System.out.println("Tipo de drone: Agricola");
        mostrarDatos();
        System.out.println("Capacidad del tanque: " + capacidadtanque);
        System.out.println("Tipo de pesticida: " + tipopesticida);
        System.out.println("Area cubierta: " + areacubierta);
        System.out.println("Nivel de liquido: "+ nivelliquido);
        
                
    }
    
    @Override
    public void IniciarMision(){
        System.out.println("DRONE AGRICOLA");
        System.out.println("Activando sistema de FUMIGACION");
        System.out.println("Iniciando MONITOREO");
        System.out.println("Verificando los niveles de LIQUIDO");
    }
    
    @Override
    public double calcularConsumo() {
    return capacidadtanque * 1.5 + areacubierta * 0.3;
    }
    
    public void agregarSensor(Sensor sensor){   // Metodo para agregar sensor a la lista.
        sensores.add(sensor);
    }
    public void mostrarSensores(){
        System.out.println("Sensores Instalados en DRONE AGRICOLA");
        for (Sensor s:sensores){    //recorre la lista de sensores, S representa el sensor actual
            s.mostrarInfo();    //LLama para cada sensor S, el metodo definido en su clase. 
        }
    }
    
}
