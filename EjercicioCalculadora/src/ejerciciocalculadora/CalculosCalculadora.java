/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculadora;

/**
 *
 * @author Juan Rivera
 */
public class CalculosCalculadora {
    int valorEntrada1;
    int valorEntrada2;
    
    
    //con parametros
    public CalculosCalculadora(int valor1, int valor2){
        this.valorEntrada1=valor1;
        this.valorEntrada2=valor2;
    }
    
    //sin parametros
    
    public CalculosCalculadora(){
     
    }
    
    
     int sumaCalculadora(int valor1, int valor2){
        return valor1+valor2;
    }
    
    public int restaCalculadora(int valor1, int valor2){
        return valor1-valor2;
    }
    
    
    
    
    
    
    
}
