
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // DRONE VIGILANCIA (TP1)
            Bateria bat1 = new Bateria(1000, 50.5, 120, "Optimo");
            GPS gps1  = new GPS(1.5, "4.2.1", "Galileo");
            Operador op1 = new Operador("Pablo", "Sanchez", "021", 4, "Vigilancia");
          
            DroneVigilancia dv1 = new DroneVigilancia("DV-001", 4.5, bat1, gps1,45, 4, true, 12.0);
            dv1.setOperador(op1); //Asocio el operador con el drone de vigilancia: relacion de asociacion
            
            // DRONE CARGA (TP1)
            Bateria bat2 = new Bateria(1000, 50.5, 120, "Optimo");
            GPS gps2  = new GPS(1.5, "4.2.1", "Galileo");
            CentroOperativo cp1 = new CentroOperativo("Centro","La Plata", "T-332", 5);
            
            DroneCarga dc1= new DroneCarga("DC-001", 4.0, bat2, gps2, 30.00, "Suministros", 20.00, 60.00, "Log-001" ); 
            dc1.setCentrooperativo(cp1);//Asocio el Centro Operativo con el drone de carga: relacion de asociacion
            
           // DRONE EXPLORACION 
            Bateria bat3 = new Bateria(1000, 50.5, 120, "Optimo");
            GPS gps3  = new GPS(1.5, "4.2.1", "Galileo");
            DroneExploracion de1 = new DroneExploracion("DE-001", 6.0, bat3, gps3, 4000, "Alta", 6, "Montaña", 0.8);
            
            //Agregar sensores
            Sensor s1 = new Sensor ("SEN-001", "temperatura", 500.0, "Activo");
            Sensor s2 = new Sensor ("SEN-002", "temperatura", 500.0, "Activo");
            de1.agregarSensor(s1);
            de1.agregarSensor(s2);
            
            // DRONE RESCATE 
            Bateria bat4 = new Bateria(7200, 40.0, 160, "Desgaste moderado");
            GPS gps4 = new GPS(1.2, "4.5.0", "GPS-USA");
            DroneRescate dr1 = new DroneRescate("DR-001", 5.0, bat4, gps4, true, true, 0, 110.0, 20.0);
            
            //Agregar personas rescatadas
            PersonaRescatada p1 = new PersonaRescatada("Juan Lopez", 35, "DNI-12345678", "Estable");
            PersonaRescatada p2 = new PersonaRescatada("Maria Garcia", 28, "DNI-87654321", "Critico");
            dr1.agregarPersona(p1);
            dr1.agregarPersona(p2);
            
            //DRONE MILITAR 
            Bateria bat5 = new Bateria(9000, 75.0, 200, "Optimo");
            GPS gps5 = new GPS(0.5, "6.0.1", "Galileo");
            DroneMilitar dm1 = new DroneMilitar("DM-001", 8.0, bat5, gps5,5, 150.0, true, "Ofensiva", 10.0);
            
            // Creamos la flota y agregamos todos los drones
            ArrayList<Drone> flota = new ArrayList<>(); //creamos una lista "flota" para almacenar los drones
            flota.add(dv1); //agregamos drone vigilancia
            flota.add(dc1); //agregamos drone carga
            flota.add(de1); //agregamos drone exploracion
            flota.add(dr1); //agregamos drone rescate
            flota.add(dm1); //agregamos drone militar
            
            //Recorremos la flota
            System.out.println("Iniciar Misiones: ");
            for (Drone d: flota){
                d.IniciarMision();  //llamamos el metodo para cada drone
                System.out.println("Consumo: " + d.calcularConsumo());
                System.out.println();
            }
            
            de1.mostrarSensores(); //llama el metodo que recorre la lista y muestra los sensores
            System.out.println();
            dr1.mostrarPersonas(); //recorre la lista y muestra a cada persona
            System.out.println();
            
            //Registro de misiones
            dm1.registrarMision("Operacion Secreta", 1, "ESTE");
            dv1.registrarMision("Recorrido rutinario");
            dc1.registrarMision("Entrega suministros", 3);
            
            //DRONE AGRICOLA 
            Bateria bat6 = new Bateria(7000, 80.0, 140, "Optimo");
            GPS gps6 = new GPS(1.0, "4.8.0", "GPS-USA");
            DroneAgricola da1 = new DroneAgricola("DA-001", 5.0, bat6, gps6, 200.0, "Herbicida", 50.0,75.0);
            
            Sensor s3 = new Sensor("SEN-003", "Humedad suelo", 100.0, "Activo");
            Sensor s4 = new Sensor("SEN-004", "Temperatura", 200.0, "Activo");
            da1.agregarSensor(s3);
            da1.agregarSensor(s4);
            flota.add(da1);
            
            //Recorremos la flota
            System.out.println("Iniciar Misiones: ");
            for (Drone d: flota){
                d.IniciarMision();  //llamamos el metodo para cada drone
                System.out.println("Consumo: " + d.calcularConsumo());
                System.out.println();
            }
            System.out.println();
            da1.mostrarSensores();
            System.out.println();
            da1.infoDroneA();
    }   }           
