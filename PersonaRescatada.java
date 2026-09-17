/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class PersonaRescatada {
    private String nombre;
    private int edad;
    private String identificacion;
    private String estadoasistencia;
    
    public PersonaRescatada(String nombre, int edad, String identificacion, String estadoasistencia){
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.estadoasistencia = estadoasistencia;
    }
    public void mostrarInfo() {
    System.out.println("Persona " + identificacion + " Nombre: " + nombre 
            + " Edad: " + edad + " Estado: " + estadoasistencia);
}
    
}
