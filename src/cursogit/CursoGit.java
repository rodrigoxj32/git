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
        Persona persona = new Persona();
        
        persona.setApellidos("Rodrigo");
        persona.setEdad(15);
                
        System.out.println(persona.toString());
    }
    
}
