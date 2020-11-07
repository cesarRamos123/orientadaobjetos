/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Javier Ramos
 */
public class ciudadano {
    
    private String nombre;
    private int edad;
    private int añosDeExperiencia;
    
    
    public void setNombre ( String _nombre ){
        this.nombre=_nombre;
    } 
    public String getNombre (){
        return nombre;
    }
    
    public void setEdad (int _edad){
        this.edad=_edad;
    }
    public int getEdad (){
        return edad;
    }
    
    public void setAñosDeExperiencia (int _añosDeExperiencia ){
        this.añosDeExperiencia=_añosDeExperiencia;
    }
    public int getAñosaDeExperiencia(){
        return añosDeExperiencia;
    } 
}

    