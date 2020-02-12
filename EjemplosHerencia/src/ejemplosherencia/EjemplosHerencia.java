/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosherencia;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Juan Rivera
 */
public class EjemplosHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motos moto1= new Motos();
        moto1.cantidadEjes=2;
        moto1.cantidadLlantas=2;
        
        Carros carro1= new Carros();
        carro1.cantidadLlantas=5;
        carro1.setMarcaVehiculo("Chevrolet");
    }
    
}
