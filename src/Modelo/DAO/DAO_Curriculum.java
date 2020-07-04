/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Curriculum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Chelo
 */
public class DAO_Curriculum extends Conexion implements DAO<Curriculum>{

    public DAO_Curriculum() throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(Curriculum obj) throws SQLException {
        
        //obj.getFechaNacimiento()
        
      ejecutar("INSERT INTO CURRICULUM VALUES (NULL, '"+obj.getNombre()+"', '"+obj.getApellido()+"', '"+obj.getRut()+"', '"+obj.getFechaNacimiento()+"',"
              + " '"+obj.getNacionalidad()+"', '"+obj.getEstadoCivil()+"' , "+obj.isEsHombre()+", '"+obj.getTelefono()+"', '"+obj.getCorreo()+"', '"+obj.getDireccion()+"',"
              + " '"+obj.getNivelDeEstudio()+"', '"+obj.getOcupación()+"', '"+obj.getDisponibilidad()+"'  );");
              
    }

    @Override
    public List<Curriculum> read() throws SQLException {
        List<Curriculum> listado = new ArrayList<>();
        
        ResultSet rs = ejecutar("SELECT * FROM CURRICULUM");
       
        Curriculum cur = null;
        
        while(rs.next()){
            try {
                cur = new Curriculum(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getDate(4),rs.getString(5),
                        rs.getString(6),rs.getBoolean(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),
                        rs.getString(12),rs.getString(13));
            
                
                listado.add(cur);
            } catch (Exception e) {
            }
        }
        
        
        close();
        return listado;
    }

    @Override
    public void update(Curriculum obj) throws SQLException {
        ejecutar("UPDATE CURRICULUM SET WHERE = "+obj.getId()+" ;"); //sin terminar
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM CURRICULUM WHERE id = "+id+"; ");
    }

    @Override
    public Curriculum findById(int id) throws SQLException {
        
        ResultSet rs = ejecutar("SELECT * FROM CURRICULUM WHERE id = "+id+"");
       
        Curriculum obj = null;
        
        while(rs.next()){
            try {
                obj = new Curriculum(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getDate(4),rs.getString(5),
                        rs.getString(6),rs.getBoolean(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),
                        rs.getString(12),rs.getString(13));         
            } catch (Exception e) {
            }
        }
        
        
        close();
        return obj;
        
        
    }
    
    
    public String convertirFechaAFormatoString(Date fecha){
        String fechaComoString = ""; 
        
        
        return fechaComoString;
    }
    
}
