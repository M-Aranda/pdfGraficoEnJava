/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Chelo
 */
public class Referencia {
    private int id;
    private String nombre, apellido, cargo, teléfono;
    private int curriculumFK;

    public Referencia() {
    }

    public Referencia(int id, String nombre, String apellido, String cargo, String teléfono, int curriculumFK) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.teléfono = teléfono;
        this.curriculumFK = curriculumFK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public int getCurriculumFK() {
        return curriculumFK;
    }

    public void setCurriculumFK(int curriculumFK) {
        this.curriculumFK = curriculumFK;
    }

    @Override
    public String toString() {
        return "Referencia{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", tel\u00e9fono=" + teléfono + ", curriculumFK=" + curriculumFK + '}';
    }

  
    
    
    
}
