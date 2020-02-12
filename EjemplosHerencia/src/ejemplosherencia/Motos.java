/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosherencia;

/**
 *
 * @author Juan Rivera
 */
public class Motos extends Vehiculos{
    private String tiposFreno;
    public String casco;
    
    //Constructor
    Motos(){
        super();
    
    }
    
    //get
    public String getTipoFreno(){
        return this.tiposFreno;
    }
    //set
    public void setTipoFreno(String tipoFreno){
        this.tiposFreno=tipoFreno;
    }
    
}
