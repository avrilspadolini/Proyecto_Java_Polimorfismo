/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Avril
 */
public class GPS {
    private double precision;
    private String versionfirmware;
    private String proveedorsat;
    
    public GPS(double precision, String versionfirmware, String proveedorsat){
        this.precision = precision;
        this.proveedorsat = proveedorsat;
        this.versionfirmware = versionfirmware;
    }

    public String getVersionfirmware() {
        return versionfirmware;
    }

    public void setVersionfirmware(String versionfirmware) {
        this.versionfirmware = versionfirmware;
    }

    
    
}
