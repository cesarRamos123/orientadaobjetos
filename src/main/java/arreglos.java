import java.util.Scanner;
public class arreglos {
  public static void main(String args []) {
        String [] arrMulti =new String[20];
        String ac=" ";
        Scanner ingresoTeclado = new Scanner(System.in);
           
        for (int i=0;i<20;i++){
            System.out.print("Introduce el nombre de la ciudad : ");
            arrMulti[i] = ingresoTeclado.nextLine();         
        }
        for(int i=0; i<20; i++){
                ac += arrMulti[i]+"  ";
                ac +="\n";
            System.out.print(ac);
            }
            
        }
        
    }  
   

