
import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Líneas;
import helpers.Triangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Ramos
 */
public class claseprincipal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo Circulo = new Circulo ();
        Líneas Líneas = new Líneas ();
        Triangulo Triangulo = new Triangulo ();
        Cuadrado Cuadrado = new Cuadrado ();
        
        System.out.println("----FORMAS----");
        Circulo.Imprimir();
        Circulo.caculaarraRadio();
        Líneas.getLargo();
        Líneas.Imprimir();
        Triangulo.Imprimir();
        Triangulo.CalcularArea();
        Cuadrado.Imprimir();
        Cuadrado.cacularArea();
    }
    
}
