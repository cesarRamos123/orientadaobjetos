
import helpers.CostaRica;
import helpers.ElSalvador;
import helpers.Honduras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Ramos
 */
public class PacticaAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Honduras Honduras = new Honduras ();
        ElSalvador ElSalvador = new ElSalvador ();
        CostaRica CostaRica = new CostaRica ();
      
        System.out.println(Honduras.getPais());
        System.out.println("presidente de Honduras:"+Honduras.getPresidente());
        System.out.println(ElSalvador.getPais());
        System.out.println("presidente de El Salvador:"+ElSalvador.getPresidente());
        System.out.println(CostaRica.getPais());
        System.out.println("presidente de Costa Rica:"+ CostaRica.getPresidente());
    }
    
}
