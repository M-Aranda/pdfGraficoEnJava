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
public class Idioma_curriculum {
    
    private int id, idiomaFK, curriculumFK;

    public Idioma_curriculum() {
    }

    public Idioma_curriculum(int id, int idiomaFK, int curriculumFK) {
        this.id = id;
        this.idiomaFK = idiomaFK;
        this.curriculumFK = curriculumFK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdiomaFK() {
        return idiomaFK;
    }

    public void setIdiomaFK(int idiomaFK) {
        this.idiomaFK = idiomaFK;
    }

    public int getCurriculumFK() {
        return curriculumFK;
    }

    public void setCurriculumFK(int curriculumFK) {
        this.curriculumFK = curriculumFK;
    }
    
    
    
}
