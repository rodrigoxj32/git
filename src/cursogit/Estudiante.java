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
public class Estudiante {
    private String nombre;
    private String carrera;
    private String materia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + ", materia=" + materia + '}';
    }
    
    
}
