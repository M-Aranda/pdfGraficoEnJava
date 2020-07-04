/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Chelo
 */
public class Experiencia {
    private int id;
    private String lugar,cargo;
    private int aniosTrabajando, curriculumFK;

    public Experiencia() {
    }

    public Experiencia(int id, String lugar, String cargo, int aniosTrabajando, int curriculumFK) {
        this.id = id;
        this.lugar = lugar;
        this.cargo = cargo;
        this.aniosTrabajando = aniosTrabajando;
        this.curriculumFK = curriculumFK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAniosTrabajando() {
        return aniosTrabajando;
    }

    public void setAniosTrabajando(int aniosTrabajando) {
        this.aniosTrabajando = aniosTrabajando;
    }

    public int getCurriculumFK() {
        return curriculumFK;
    }

    public void setCurriculumFK(int curriculumFK) {
        this.curriculumFK = curriculumFK;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", lugar=" + lugar + ", cargo=" + cargo + ", aniosTrabajando=" + aniosTrabajando + ", curriculumFK=" + curriculumFK + '}';
    }
    
    

 
    
    
}
