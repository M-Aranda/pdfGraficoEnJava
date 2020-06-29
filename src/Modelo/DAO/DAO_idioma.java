/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Idioma;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class DAO_idioma extends Conexion implements DAO<Idioma> {

    public DAO_idioma(String bd) throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(Idioma obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Idioma> read() throws SQLException {

        List<Idioma> idiomas = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM IDIOMA");

        Idioma idioma = null;
        while (rs.next()) {
            try {
                idioma = new Idioma(rs.getInt(1), rs.getString(2));
                idiomas.add(idioma);
            } catch (Exception e) {
            }
        }
        close();
        return idiomas;
    }

    @Override
    public void update(Idioma obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Idioma findById(int id) throws SQLException {

        ResultSet rs = ejecutar("SELECT * FROM IDIOMA WHERE id= " + id + "");

        Idioma idioma = null;
        while (rs.next()) {
            try {
                idioma = new Idioma(rs.getInt(1), rs.getString(2));
            } catch (Exception e) {
            }
        }
        close();

        return idioma;
    }

}
