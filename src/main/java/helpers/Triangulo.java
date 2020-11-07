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
public class Triangulo extends formas{
    private int angulo;
    private double area;
    public Triangulo (){
        setDibujar ("Triangulo con base 3 y altura 5");
        setColor ("rojo");
    }
    
    public void setAngulo (int angulo){
        this.angulo=angulo;
    }
    public int getAngulo (){
        return this.angulo;
    }
    public void CalcularArea ( ){
        area= (3 * 5 ) / 2 ;
        System.out.println("area de el triangulo :"+area);
    }

    
}

