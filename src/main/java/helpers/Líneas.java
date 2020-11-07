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
public class Líneas extends formas  {
    
    private int largo ;
    
    public void setLargo (int largo){
        this.largo=largo;
    }
    public int getLargo (){
        return this.largo;
    }
     
    public Líneas (){
        setDibujar (" Líneas");
        setColor ("amariilo");
    }

   
}

