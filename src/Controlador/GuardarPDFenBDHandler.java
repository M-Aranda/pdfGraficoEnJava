/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConocimientoDeInformatica;
import Modelo.ConocimientoDeInformatica_curriculum;
import Modelo.Curriculum;
import Modelo.DAO.DAO_Curriculum;
import Modelo.DAO.DAO_conocimienoDeInformatica;
import Modelo.DAO.DAO_conocimientoDeInformatica_curriculum;
import Modelo.DAO.DAO_experiencia;
import Modelo.DAO.DAO_idioma;
import Modelo.DAO.DAO_idioma_curriculum;
import Modelo.DAO.DAO_referencia;
import Modelo.Experiencia;
import Modelo.Idioma;
import Modelo.Idioma_curriculum;
import Modelo.Referencia;
import Vista.GUI;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class GuardarPDFenBDHandler {

    private static Curriculum c = GUI.c;
    private static List<Experiencia> experiencias = GUI.experienciasLaboralesAgregadas;
    private static List<Referencia> referencias = GUI.referenciasAgregadas;
    private static List<Idioma> idiomas = GUI.idiomasSeleccionados;
    private static List<ConocimientoDeInformatica> conocimientos = GUI.conocimientosDeInformaticaSeleccionados;

    private DAO_Curriculum dc;
    private DAO_experiencia de;
    private DAO_idioma di;
    private DAO_referencia dr;
    private DAO_conocimienoDeInformatica dci;
    
    private DAO_conocimientoDeInformatica_curriculum dcic;
    private DAO_idioma_curriculum dIdiomaCurriculum;

    public void guardarPDF() throws ClassNotFoundException, SQLException {

        dc = new DAO_Curriculum();
        de = new DAO_experiencia();
        di = new DAO_idioma("");
        dr = new DAO_referencia("");
        dci = new DAO_conocimienoDeInformatica("");
        dcic = new DAO_conocimientoDeInformatica_curriculum("");
        dIdiomaCurriculum = new DAO_idioma_curriculum("");
        
        dc.create(c);
        
        
        for (Experiencia e : experiencias) {
            e.setCurriculumFK(dc.getMaxID());
            de.create(e);
        }
        
        for (Referencia r : referencias) {
            r.setCurriculumFK(dc.getMaxID());
            dr.create(r);
        }
        
        
        for (Idioma i : idiomas) {
            dIdiomaCurriculum.create(new Idioma_curriculum(1, i.getId(), dc.getMaxID()));
            
        }
        
        for (ConocimientoDeInformatica conIn : conocimientos) {
             dcic.create(new ConocimientoDeInformatica_curriculum(1, conIn.getId(), dc.getMaxID()));
        }
        
        

    }

}
