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
public class ConocimientoDeInformatica_curriculum {
    
    private int id, conInformaticaFK, curriculumFK;

    public ConocimientoDeInformatica_curriculum() {
    }

    public ConocimientoDeInformatica_curriculum(int id, int conInformaticaFK, int curriculumFK) {
        this.id = id;
        this.conInformaticaFK = conInformaticaFK;
        this.curriculumFK = curriculumFK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConInformaticaFK() {
        return conInformaticaFK;
    }

    public void setConInformaticaFK(int conInformaticaFK) {
        this.conInformaticaFK = conInformaticaFK;
    }

    public int getCurriculumFK() {
        return curriculumFK;
    }

    public void setCurriculumFK(int curriculumFK) {
        this.curriculumFK = curriculumFK;
    }
    
    
    
}
