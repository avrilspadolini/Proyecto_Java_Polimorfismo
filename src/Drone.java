/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public abstract class Drone {
    protected String Id;
    protected double autonomiaVuelo;
    protected Bateria bateria; //Composicion: si se elimina el drone, tambien se eliminan. Van en el constructor.
    protected GPS gps;  //Composicion. 
    protected CentroOperativo centrooperativo;  //Asociacion: puede existir sin el drone. 
    
    
    public Drone(String Id, double autonomiaVuelo, Bateria bateria, GPS gps){ 
        this.Id = Id;
        this.autonomiaVuelo = autonomiaVuelo;
        this.bateria = bateria;
        this.gps = gps;
    }

    public void mostrarDatos(){
        System.out.println("ID: " + Id);
        System.out.println("Autonomia Vuelo: "+ autonomiaVuelo);
        System.out.println("Nivel Bateria: " + bateria.getPorcentajeact());
        System.out.println("Version Firmware: " + gps.getVersionfirmware());
        if (centrooperativo != null){
            System.out.println("Centro Operativo: " + centrooperativo.getNombre());
        }else{
            System.out.println("No posee un Centro Operativo asignado");
        }
    }
    public CentroOperativo getCentrooperativo() {
        return centrooperativo;
    }

    public void setCentrooperativo(CentroOperativo centrooperativo) {
        this.centrooperativo = centrooperativo;
    }
    
    //Tres metodos de registrar mision, a traves de los parametro enviados en el main se implementa la adecuada. 
    public void registrarMision(String nombre){
        System.out.println("Mision registrada: "+ nombre);
    }
    public void registrarMision(String nombre, int prioridad){
        System.out.println("Mision registrada: "+ nombre+ " Prioridad: "+ prioridad);
    }
    public void registrarMision(String nombre, int prioridad, String zona){
        System.out.println("Mision registrada: "+ nombre+ " Prioridad: "+ prioridad+ " Zona: "+ zona);   
    }
    
    //se declara en DRONE ,pero cada subclase lo implementa a su forma
    public abstract void IniciarMision();
    
    public abstract double calcularConsumo(); 
}
