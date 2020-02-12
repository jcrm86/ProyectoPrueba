/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosherencia;

import java.util.Date;

/**
 *
 * @author Juan Rivera
 */
public class Vehiculos {
    private String marcaVehiculo;
    public Date Modelo;
    public String tipoMotor;
    public int cantidadLlantas;
    public int cantidadEjes;
    
    public Vehiculos(){
    
    }
    
    public String getMarcaVehiculo(){
        return this.marcaVehiculo;
    }
    
    public void setMarcaVehiculo(String marca){
        this.marcaVehiculo=marca;
    }
    
}
