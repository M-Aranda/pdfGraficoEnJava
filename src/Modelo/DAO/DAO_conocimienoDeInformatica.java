/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.ConocimientoDeInformatica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class DAO_conocimienoDeInformatica extends Conexion implements DAO<ConocimientoDeInformatica> {

    public DAO_conocimienoDeInformatica(String bd) throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(ConocimientoDeInformatica obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ConocimientoDeInformatica> read() throws SQLException {

        List<ConocimientoDeInformatica> conocimientosDeInformatica = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM CONOCIMIENTODEINFORMATICA;");
        ConocimientoDeInformatica conocimiento = null;
        while (rs.next()) {
            try {
                conocimiento = new ConocimientoDeInformatica(rs.getInt(1), rs.getString(2));
                conocimientosDeInformatica.add(conocimiento);

            } catch (Exception e) {
            }
        }
        close();
        return conocimientosDeInformatica;
    }

    @Override
    public void update(ConocimientoDeInformatica obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConocimientoDeInformatica findById(int id) throws SQLException {

        ResultSet rs = ejecutar("SELECT * FROM CONOCIMIENTODEINFORMATICA WHERE id = " + id + " ; ");
        ConocimientoDeInformatica conocimiento = null;
        while (rs.next()) {
            try {
                conocimiento = new ConocimientoDeInformatica(rs.getInt(1), rs.getString(2));

            } catch (Exception e) {
            }
        }
        close();
        return conocimiento;
    }

    public ConocimientoDeInformatica findByName(String nombre) throws SQLException {

        ResultSet rs = ejecutar("SELECT * FROM IDIOMA WHERE nombre = '" + nombre + "'");

        ConocimientoDeInformatica conInfo = null;
        while (rs.next()) {
            try {
                conInfo = new ConocimientoDeInformatica(rs.getInt(1), rs.getString(2));
            } catch (Exception e) {
            }
        }
        close();

        return conInfo;
    }

}
