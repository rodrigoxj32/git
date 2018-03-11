/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursogit;

/**
 *
 * @author Daniel
 */

import java.util.Scanner;

public class CursoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

        Estudiante estu = new Estudiante();
      
        estu.setCarrera("Ingenieria");
        
        System.out.println(estu.toString());
=======
        Persona persona = new Persona();
        
        persona.setApellidos("Rodrigo");
        persona.setNombres("Daniel");
                
        System.out.println(persona.toString());
        
        
>>>>>>> 32025bbe4b3c930f2e336a45a0c3ca795a0cdb69
        
    }
    
}
