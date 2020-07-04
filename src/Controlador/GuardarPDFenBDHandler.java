/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Curriculum;
import Modelo.DAO.DAO_Curriculum;
import Vista.GUI;
import java.sql.SQLException;

/**
 *
 * @author Chelo
 */
public class GuardarPDFenBDHandler {
    
    private static Curriculum c = GUI.c ;
    private DAO_Curriculum dc; 
    
    public  void guardarPDF () throws ClassNotFoundException, SQLException{
        
        dc = new DAO_Curriculum();
        dc.create(c);
        
    }
    
    
    
    
    
    
}
