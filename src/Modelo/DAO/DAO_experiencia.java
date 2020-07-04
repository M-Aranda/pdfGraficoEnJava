/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Experiencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class DAO_experiencia extends Conexion implements DAO<Experiencia>{

    public DAO_experiencia() throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(Experiencia obj) throws SQLException {
       ejecutar("INSERT INTO EXPERIENCIA VALUES (NULL, '"+obj.getLugar()+"', '"+obj.getCargo()+"', "+obj.getAniosTrabajando()+", "+obj.getCurriculumFK()+")    ;");
        
        
    }

    @Override
    public List<Experiencia> read() throws SQLException {
        List<Experiencia> experiencias = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM EXPERIENCIA;");
        
      
        Experiencia experiencia = null;
        
        while (rs.next()){
            try {
                experiencia = new Experiencia (rs.getInt(1), rs.getString(2),rs.getString(3), rs.getInt(4), rs.getInt(5));
                experiencias.add(experiencia);
            } catch (Exception e) {
            }
        }
        
        close();
        return experiencias;
    }

    @Override
    public void update(Experiencia obj) throws SQLException {
       
        ejecutar("UPDATE EXPERIENCIA SET lugar ='"+obj.getLugar()+"', cargo = '"+obj.getCargo()+"', aniosTrabajando = "+obj.getAniosTrabajando()+", "+obj.getCurriculumFK()+"    WHERE id ="+obj.getId()+";");
        
        
        
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM EXPERIENCIA WHERE id = "+id+";");
    }

    @Override
    public Experiencia findById(int id) throws SQLException {
       ResultSet rs = ejecutar("SELECT * FROM EXPERIENCIA;");
        
      
        Experiencia experiencia = null;
        
        while (rs.next()){
            try {
                experiencia = new Experiencia (rs.getInt(1), rs.getString(2),rs.getString(3), rs.getInt(4), rs.getInt(5));
                
            } catch (Exception e) {
            }
        }
        close();
        return experiencia;  
    }
    
}
