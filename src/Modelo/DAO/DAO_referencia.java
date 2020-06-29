/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Referencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class DAO_referencia extends Conexion implements DAO<Referencia> {

    public DAO_referencia(String bd) throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(Referencia obj) throws SQLException {
        ejecutar("INSERT INTO REFERENCIA VALUES (NULL, '" + obj.getNombre() + "', '" + obj.getApellido() + "', '" + obj.getCargo() + "', '" + obj.getTeléfono() + "', "+obj.getCurriculumFK()+");");
    }

    @Override
    public List<Referencia> read() throws SQLException {
        List<Referencia> referencias = new ArrayList<>();

        ResultSet rs = ejecutar("SELECT * FROM REFERENCIA;");
        Referencia referencia = null;

        while (rs.next()) {
            try {
                referencia = new Referencia(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                referencias.add(referencia);
            } catch (Exception e) {
            }
        }

        close();
        return referencias;
    }

    @Override
    public void update(Referencia obj) throws SQLException {
        ejecutar("UPDATE REFERENCIA SET nombre = '" + obj.getNombre() + "', '" + obj.getApellido() + "', '" + obj.getCargo() + "', '" + obj.getTeléfono() + "', "+obj.getCurriculumFK()+" WHERE = " + obj.getId() + "");
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM REFERENCIA WHERE id = " + id + ";");
    }

    @Override
    public Referencia findById(int id) throws SQLException {
        ResultSet rs = ejecutar("SELECT * FROM REFERENCIA WHERE id = " + id + " ;");
        Referencia referencia = null;

        while (rs.next()) {
            try {
                referencia = new Referencia(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));

            } catch (Exception e) {
            }
        }

        close();
        return referencia;
    }

}
