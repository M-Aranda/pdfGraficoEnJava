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
    private Date fechaDeInicio,fechaDeTermino;
    private int curriculumFK;

    public Experiencia() {
    }

    public Experiencia(int id, String lugar, String cargo, Date fechaDeInicio, Date fechaDeTermino, int curriculumFK) {
        this.id = id;
        this.lugar = lugar;
        this.cargo = cargo;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeTermino = fechaDeTermino;
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

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeTermino() {
        return fechaDeTermino;
    }

    public void setFechaDeTermino(Date fechaDeTermino) {
        this.fechaDeTermino = fechaDeTermino;
    }

    public int getCurriculumFK() {
        return curriculumFK;
    }

    public void setCurriculumFK(int curriculumFK) {
        this.curriculumFK = curriculumFK;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", lugar=" + lugar + ", cargo=" + cargo + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeTermino=" + fechaDeTermino + ", curriculumFK=" + curriculumFK + '}';
    }
    
    

   
    
    
    
}
