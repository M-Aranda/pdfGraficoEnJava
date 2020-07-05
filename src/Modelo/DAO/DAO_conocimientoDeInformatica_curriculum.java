/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.ConocimientoDeInformatica_curriculum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class DAO_conocimientoDeInformatica_curriculum extends Conexion implements DAO<ConocimientoDeInformatica_curriculum> {

    public DAO_conocimientoDeInformatica_curriculum(String bd) throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(ConocimientoDeInformatica_curriculum obj) throws SQLException {
        ejecutar("INSERT INTO CONOCIMIENTOINFORMATICA_CURRICULUM VALUES (NULL, " + obj.getConInformaticaFK() + ", " + obj.getCurriculumFK() + ") ;");
    }

    @Override
    public List<ConocimientoDeInformatica_curriculum> read() throws SQLException {
        List<ConocimientoDeInformatica_curriculum> listado = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM CONOCIMIENTOINFORMATICA_CURRICULUM;");

        ConocimientoDeInformatica_curriculum conInfo_curr = null;
        while (rs.next()) {
            try {
                conInfo_curr = new ConocimientoDeInformatica_curriculum(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                listado.add(conInfo_curr);
            } catch (Exception e) {
            }
        }

        return listado;

    }

    @Override
    public void update(ConocimientoDeInformatica_curriculum obj) throws SQLException {
        ejecutar("UPDATE CONOCIMIENTOINFORMATICA_CURRICULUM SET conInformatica = " + obj.getConInformaticaFK() + ", curriculumFK = " + obj.getCurriculumFK() + "   WHERE = " + obj.getId() + " ;");
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM CONOCIMIENTOINFORMATICA_CURRICULUM WHERE id = " + id + " ;");
    }

    @Override
    public ConocimientoDeInformatica_curriculum findById(int id) throws SQLException {

        ResultSet rs = ejecutar("SELECT * FROM CONOCIMIENTOINFORMATICA_CURRICULUM;");

        ConocimientoDeInformatica_curriculum conInfo_curr = null;
        while (rs.next()) {
            try {
                conInfo_curr = new ConocimientoDeInformatica_curriculum(rs.getInt(1), rs.getInt(2), rs.getInt(3));

            } catch (Exception e) {
            }
        }

        return conInfo_curr;
    }
    
    

}
