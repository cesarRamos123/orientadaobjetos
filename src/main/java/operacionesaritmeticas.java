
public class operacionesaritmeticas {
    
     public static void main(String[] args) {
         double numero1 = 10;
         double numero2 = 20; 
         double numero3 = 30;
         double numero4 = 40;
         double suma, resta, multiplicacion = 0;
         double division = 0; 

         suma = numero1 + numero2 + numero3 + numero4;
         resta = numero1 - numero2 - numero4 - numero3;
         multiplicacion = numero1 * numero2 * numero4 * numero3;

  
         if (numero2 != 0){

                division = numero1 / numero2;
         }
         if (numero4 !=0){
             division = numero4 / numero3;
         }

 System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta);
 System.out.println("La multiplicacion es: " + multiplicacion);
 System.out.println("La division es: " + division);

        

  }
    
}
