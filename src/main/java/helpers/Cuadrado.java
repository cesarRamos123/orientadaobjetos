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
public class Cuadrado extends formas  {
    private int area ;
    
    public Cuadrado (){
        setDibujar ("cuadrado con 5 de lado");
        setColor ("violeta");
    }
    
    public void setArea (int area ){
        this.area=area;
    }
    public int getArea (){
        return this.area;
    }
    public void cacularArea (){
        area = 5*5;
       System.out.println("area de el cuadrado  :"+area);
    }
}
