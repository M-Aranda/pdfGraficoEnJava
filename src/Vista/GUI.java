/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Chelo
 */
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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {

        DAO_Curriculum dao_curriculum = new DAO_Curriculum("");
        DAO_conocimienoDeInformatica dao_conocimienoDeInformatica = new DAO_conocimienoDeInformatica("");
        DAO_conocimientoDeInformatica_curriculum dao_conocimientoDeInformatica_curriculum = new DAO_conocimientoDeInformatica_curriculum("");
        DAO_experiencia dao_experiencia = new DAO_experiencia("");
        DAO_idioma dao_idioma = new DAO_idioma("");
        DAO_idioma_curriculum dao_idioma_curriculum = new DAO_idioma_curriculum("");
        DAO_referencia dao_referencia = new DAO_referencia("");

        ConocimientoDeInformatica coIn = dao_conocimienoDeInformatica.findById(1);
        Idioma idioma = dao_idioma.findById(1);

        
        
        
        //esto es para la fecha
        String date_s = "2020-12-15";
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dt.parse(date_s);
        
        java.sql.Date sqlDate =  java.sql.Date.valueOf("2011-01-18");

        Curriculum c = new Curriculum(1, "nombre", "apellido", "123", sqlDate, "nacionalidad", "estadoCivil", true, "telefono", "correo", "direccion", "nivelDeEstudio", "ocupacion", "disponibilidad");

        Experiencia e = new Experiencia(1, "algun lugar", "algun cargo", sqlDate, sqlDate, 1);
        Referencia r = new Referencia(1, "fulano", "de tal", "un cargo cualquiera", "234234213", 1);

        ConocimientoDeInformatica_curriculum cInfCurr = new ConocimientoDeInformatica_curriculum(1, coIn.getId(), 1);
        Idioma_curriculum idCur = new Idioma_curriculum(1, idioma.getId(), 1);

        dao_curriculum.create(c);
        dao_experiencia.create(e);
        dao_referencia.create(r);

        dao_conocimientoDeInformatica_curriculum.create(cInfCurr);
        dao_idioma_curriculum.create(idCur);

    }

}
