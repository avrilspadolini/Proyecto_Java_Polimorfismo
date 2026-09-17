
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class DroneExploracion extends Drone{
    private double altitudmax;
    private String resistclim;
    private int cantsensores;
    private String tipoterrenoanalizado;
    private double precisiongeo;
    private ArrayList<Sensor> sensores = new ArrayList<>(); // Creamos una lista para almacenar sensores.
    
    public DroneExploracion(String Id, double autonomiaVuelo, Bateria bateria, GPS gps, double altitudmax, String resistclim, int cantsensores, String tipoterrenoanalizado, double precisiongeo){
        super(Id, autonomiaVuelo, bateria, gps);
        this.altitudmax = altitudmax;
        this.resistclim = resistclim;
        this.cantsensores = cantsensores;
        this.tipoterrenoanalizado = tipoterrenoanalizado;
        this.precisiongeo = precisiongeo;
    }
    
    @Override
    public void IniciarMision(){
        System.out.println("DRONE EXPLORACION");
        System.out.println("Activando sensores");
        System.out.println("Analizando el terreno");
        System.out.println("Registrando informacion");
         
    }
    
    @Override
    public double calcularConsumo(){
        return cantsensores * 4.0;
    }
    
    public void agregarSensor(Sensor sensor){   // Metodo para agregar sensor a la lista.
        sensores.add(sensor);
    }
    public void mostrarSensores(){
        System.out.println("Sensores Instalados en DRONE EXPLORACION");
        for (Sensor s:sensores){    //recorre la lista de sensores, S representa el sensor actual
            s.mostrarInfo();    //LLama para cada sensor S, el metodo definido en su clase. 
        }
    }
}
