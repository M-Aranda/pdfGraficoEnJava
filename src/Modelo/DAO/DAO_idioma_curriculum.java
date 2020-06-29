package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Idioma_curriculum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chelo
 */
public class DAO_idioma_curriculum extends Conexion implements DAO<Idioma_curriculum> {

    public DAO_idioma_curriculum(String bd) throws ClassNotFoundException, SQLException {
        super("curriculumaPDF");
    }

    @Override
    public void create(Idioma_curriculum obj) throws SQLException {
        ejecutar("INSERT INTO IDIOMA_CURRICULUM VALUES (NULL, " + obj.getIdiomaFK() + ", " + obj.getCurriculumFK() + ") ;");
    }

    @Override
    public List<Idioma_curriculum> read() throws SQLException {
        List<Idioma_curriculum> listado = new ArrayList<>();

        Idioma_curriculum idioma_curriculum = null;

        ResultSet rs = ejecutar("SELECT * FROM IDIOMA_CURRICULUM;");
        while (rs.next()) {
            try {
                idioma_curriculum = new Idioma_curriculum(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                listado.add(idioma_curriculum);
            } catch (Exception e) {
            }
        }

        close();
        return listado;

    }

    @Override
    public void update(Idioma_curriculum obj) throws SQLException {
        ejecutar("UPDATE IDIOMA_CURRICULUM SET idiomaFK = " + obj.getIdiomaFK() + ", curriculumFK = " + obj.getCurriculumFK() + "  WHERE id = " + obj.getId() + "; ");
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM IDIOMA_CURRICULUM WHERE id = " + id + "; ");
    }

    @Override
    public Idioma_curriculum findById(int id) throws SQLException {


        Idioma_curriculum idioma_curriculum = null;

        ResultSet rs = ejecutar("SELECT * FROM IDIOMA_CURRICULUM WHERE id = "+id+";");
        while (rs.next()) {
            try {
                idioma_curriculum = new Idioma_curriculum(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                
            } catch (Exception e) {
            }
        }

        close();
        return idioma_curriculum;
    }

}
