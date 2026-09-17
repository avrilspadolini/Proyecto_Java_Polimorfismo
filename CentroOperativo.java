/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class CentroOperativo {
    private String nombre;
    private String ubicacion;
    private String codigoID;
    private int nivelseguridad;
    
    public CentroOperativo(String nombre, String ubicacion, String codigoID, int nivelseguridad){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.codigoID = codigoID;
        this.nivelseguridad = nivelseguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
