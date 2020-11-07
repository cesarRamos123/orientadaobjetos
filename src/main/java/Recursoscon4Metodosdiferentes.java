

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Ramos
 */

public class Recursoscon4Metodosdiferentes { 
    
    
        
     public  String primerMetodo() {

return "Estoy aprendiendo, pero seré el mejor programador";
}

public String segundoMetodo(float edad) {

if (edad > 18) {
return "mayor de edad";
} else {
return "menor de edad ";
}

}

public double tercerMetodo(int numero1 , int numero2 , int rm) {
try {
    numero1=10;
    numero2=5;
    rm=numero1* numero2 ;

} catch (ArithmeticException e) {
System.out.println (rm) ;
}
return 0;
}

public void cuartoMetodo(int num){
int[] listaNumeros = null;
if(num>0){
listaNumeros = new int[num + 1];
for(int i = 1; i <listaNumeros.length; i++){
listaNumeros[i] = i;
System.out.println(listaNumeros[i]);
}
}

}
}





