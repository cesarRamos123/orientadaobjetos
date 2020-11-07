
import helpers.ciudadano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Ramos
 */
public class CiudadanoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        ciudadano ciudadano = new ciudadano () ;
        
        ciudadano.setNombre("Cesar Ramos" );
        ciudadano.setEdad(19);
        ciudadano.setAñosDeExperiencia(2);
        
        
        System.out.println(" nombre :"+ciudadano.getNombre());
        System.out.println("edad :"+ ciudadano.getEdad());
        System.out.println("años de experiencia :"+ ciudadano.getAñosaDeExperiencia());
         }

}
