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
public class Circulo extends formas {
   private double radio; 
    
    
    public Circulo (){
        setDibujar("circulo con area de 15 ");
        setColor ("verde");
    } 
   
    
   public void setRadio (double radio){
       this.radio=radio;
   } 
   public double getRadio (){
       return this.radio;
   }
   public void caculaarraRadio (){
       radio=15/6.28;
       System.out.println("radio de el circulo :"+radio);
   }

    
}
