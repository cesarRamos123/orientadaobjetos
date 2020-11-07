/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Javier Ramos
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("----------Enrolamiento en la ciudad de San Pedro Sula----------");
           
           
           Enrolamiento Enrolamiento = new Enrolamiento ();
          Enrolamiento.setIndentidad("0508197600298");
          Enrolamiento.setName("Brandon White");
          Enrolamiento.setTipoDeSangre("AB+");
          Enrolamiento.setResidencia("San Pedro Sula");
          Enrolamiento.setTelefono("31826534");
          
          
          System.out.println("Identidad:"+ Enrolamiento.getIndetidad());
          System.out.println("Nombre:"+ Enrolamiento.getName());
          System.out.println("Telefono:"+ Enrolamiento.getTelefono());
          System.out.println("Residencia:"+ Enrolamiento.getResidencia());
          System.out.println("Tipo De Sangre:"+ Enrolamiento.getTipoDesangre());
    }

}
    

