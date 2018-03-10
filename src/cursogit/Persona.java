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
public class Persona {
    private String Nombres;
    private String Apellidos;
    private int Edad;

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Edad=" + Edad + '}';
    }
    
    
    
    
            
}
