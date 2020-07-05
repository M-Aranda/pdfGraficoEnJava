/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.GUI;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Chelo
 */
public class ManejoDeRespaldo {
    
        public void crearRespaldoBD() {
        try {

            /*NOTE: Getting path to the Jar file being executed*/
            /*NOTE: YourImplementingClass-> replace with the class executing the code*/
            CodeSource codeSource = GUI.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            /*NOTE: Creating Database Constraints*/
            String dbName = "curriculumaPDF";
            String dbUser = "root";
            String dbPass = "";

            /*NOTE: Creating Path Constraints for folder saving*/
            /*NOTE: Here the backup folder is created for saving inside it*/
            String folderPath = jarDir + "\\backup";

            /*NOTE: Creating Folder if it does not exist*/
            File f1 = new File(folderPath);
            f1.mkdir();

            /*NOTE: Creating Path Constraints for backup saving*/
            /*NOTE: Here the backup is saved in a folder called backup with the name backup.sql*/
            String savePath = "\"" + jarDir + "\\backup\\" + "respaldo.sql\"";

            /*NOTE: Used to create a cmd command*/
            String executeCmd = "mysqldump -u" + dbUser + "" + dbPass + " " + dbName + " -r " + savePath; //--database no es necesario,
            //tuve que agregar la ruta del bin de mysql como variable de entorno

            //cd C:\Program Files\MySQL\MySQL Server 8.0\bin  mysqldump -uroot curriculumaPDF -r "C:\Users\Chelo\Desktop\pdfGraficoEnJava\build\backup\backup.sql"
            //mysql -u root -p //hay que quitar el -p, porque mi root no tiene pass
            //NO OLVIDAR REINICIAR EL PC DESPUÉS DE HABER AGREGADO UNA VARIABLE DE SISTEMA
            System.out.println(executeCmd);
            /*NOTE: Executing the command here*/
            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
            if (processComplete == 0) {
                System.out.println("Respaldo completo");
            } else {
                System.out.println("Respaldo fallido");
            }

        } catch (Exception e) {

        }
    }
    
    
    public  void restaurarBD(String s) {
        try {
            /*NOTE: String s is the mysql file name including the .sql in its name*/
            /*NOTE: Getting path to the Jar file being executed*/
            /*NOTE: YourImplementingClass-> replace with the class executing the code*/
            CodeSource codeSource = GUI.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();

            /*NOTE: Creating Database Constraints*/
             String dbName = "curriculumaPDF";
             String dbUser = "root";
             String dbPass = "";

            /*NOTE: Creating Path Constraints for restoring*/
            String restorePath = jarDir + "\\backup" + "\\" + s;

            /*NOTE: Used to create a cmd command*/
            /*NOTE: Do not create a single large string, this will cause buffer locking, use string array*/
            
            //  mysql -u root -h localhost -p curriculumaPDF < C:\Users\Chelo\Desktop\pdfGraficoEnJava\build\backup\respaldo.sql (si se quita la -p no pide contraseña si es que no la hay)
            //  mysql -u root -h localhost  curriculumaPDF < C:\Users\Chelo\Desktop\pdfGraficoEnJava\build\backup\respaldo.sql DEBIES USAR ESTO
            
            String[] executeCmd = new String[]{"mysql", "-u", dbUser, "-h", "localhost" , dbName, " < ", restorePath};
            System.out.println(Arrays.asList(executeCmd));

            
            /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
            //Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            
           Process runtimeProcess = Runtime.getRuntime().exec("start C:\\Users\\Chelo\\Desktop\\restaurar.bat");
           
            int processComplete = runtimeProcess.waitFor();

            /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Restauración de BD completa : " + s);
            } else {
                JOptionPane.showMessageDialog(null, "Error al restaurar");
            }


        } catch (URISyntaxException | IOException | InterruptedException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error at Restoredbfromsql" + ex.getMessage());
        }

    }
    
    
}
