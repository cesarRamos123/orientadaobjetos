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
public class formas {
    private String color ;
    private String dibujar;
public formas (){
    
}
public void setColor (String color ){
this.color=color;
}

public String getColor(){
   return this.color ; 
}
        
public void setDibujar (String dibujar ){
    this.dibujar=dibujar;
}
public String getDibujar (){
    return this.dibujar;
}
public void Imprimir (){
    
    System.out.println("dibujar :"+dibujar);
    System.out.println("color :"+color);
}
      }
