
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class DroneRescate extends Drone{
    private boolean capacidadPA;
    private boolean sirenaemergencia;
    private int cantPA;
    private double velocidadmax;
    private double rangocomunicacion;
    private ArrayList<PersonaRescatada> personas = new ArrayList<>(); //Creamos una lista de personas rescatadas
    
    public DroneRescate(String Id, double autonomiaVuelo, Bateria bateria, GPS gps, boolean capacidadPA, boolean sirenaemergencia, int cantPA, double velocidadmax, double rangocomunicacion){
        super(Id, autonomiaVuelo, bateria, gps);
        this.capacidadPA = capacidadPA;
        this.sirenaemergencia = sirenaemergencia;
        this.cantPA = cantPA;
        this.velocidadmax = velocidadmax;
        this.rangocomunicacion = rangocomunicacion;
    }
    @Override
    public void IniciarMision(){
        System.out.println("DRONE RESCATE");
        System.out.println("Activando protocolo de emergencia");
        System.out.println("Preparando asistencia");
        System.out.println("Estableciendo comunicacion");
         
    }
    
    @Override
    public double calcularConsumo(){
        return rangocomunicacion * 2.0;
    }
 
    public void agregarPersona(PersonaRescatada persona){   //Metodo para agregar personas a la lista de personas rescatadas
        personas.add(persona);
    }
    
    public void mostrarPersonas() {
    System.out.println("Personas asistidas por Drone Rescate");
    for (PersonaRescatada p : personas) {   //Recorre la lista y muestra las personas rescatadas. 
        p.mostrarInfo();
    }
    }
}
