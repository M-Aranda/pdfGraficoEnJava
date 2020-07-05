/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConocimientoDeInformatica;
import Modelo.Curriculum;
import Modelo.Experiencia;
import Modelo.Idioma;
import Modelo.Referencia;
import Vista.GUI;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Chelo
 */
public class CrearPDFHandler {

    private static Curriculum c = GUI.c;
    private static java.util.List<Experiencia> experiencias = GUI.experienciasLaboralesAgregadas;
    private static java.util.List<Referencia> referencias = GUI.referenciasAgregadas;
    private static java.util.List<Idioma> idiomas = GUI.idiomasSeleccionados;
    private static java.util.List<ConocimientoDeInformatica> conocimientos = GUI.conocimientosDeInformaticaSeleccionados;

    private static String FILE = System.getProperty("user.home") + "/Desktop/Curriculum generado.pdf";//"c:/Users/Chelo/Desktop/Curriculum generado.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public static void crearArchivoDePDF() {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            //addMetaData(document);
            addTitlePage(document);
            // addContent(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    private static void addMetaData(Document document) {
        document.addTitle("My first PDF");
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
        document.addAuthor("Lars Vogel");
        document.addCreator("Lars Vogel");
    }

    private static void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // Lets write a big header
        preface.add(new Paragraph("Curriculum Vitae", catFont));

        addEmptyLine(preface, 1);
        // Will create: Report generated by: _name, _date
       /* preface.add(new Paragraph(
         "Report generated by: " + System.getProperty("user.name") + ", " + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         smallBold));
         */

        preface.add(new Paragraph("Nombre: " + c.getNombre()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Apellido: " + c.getApellido()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Rut: " + c.getRut()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Fecha de nacimiento: " + c.getFechaNacimiento().toString()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Nacionalidad: " + c.getNacionalidad()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Estado civil: " + c.getEstadoCivil()));
        addEmptyLine(preface, 1);
        String hombreOMujer = "";
        if (c.isEsHombre()) {
            hombreOMujer = "Masculino";
        } else {
            hombreOMujer = "Femenino";
        }

        preface.add(new Paragraph("Género: " + hombreOMujer));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Teléfono: " + c.getTelefono()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Correo electrónico: " + c.getCorreo()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Dirección: " + c.getDireccion()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Nivel de estudio: " + c.getNivelDeEstudio()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Ocupación: " + c.getOcupación()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Disponibilidad: " + c.getDisponibilidad()));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Idiomas: "));
        for (Idioma i : idiomas) {
            preface.add(new Paragraph(i.getNombre()));
        }
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Conocimientos de informática: "));
        for (ConocimientoDeInformatica con : conocimientos) {
            preface.add(new Paragraph(con.getNombre()));
        }
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Experiencia laboral: "));
        for (Experiencia e : experiencias) {
            preface.add(new Paragraph(e.getLugar() + "," + e.getCargo() + ", durante " + e.getAniosTrabajando() + " años."));
        }
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Referencias: "));
        for (Referencia r : referencias) {
            preface.add(new Paragraph(r.getNombre()+" "+r.getApellido()+", "+r.getCargo()+" "+r.getTeléfono()  ));
        }

        /* preface.add(new Paragraph(
         "This document describes something which is very important ",
         smallBold));

         addEmptyLine(preface, 8);

         preface.add(new Paragraph(
         "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
         redFont));
         */
        document.add(preface);
        // Start a new page
        document.newPage();
    }

    private static void addContent(Document document) throws DocumentException {
        Anchor anchor = new Anchor("First Chapter", catFont);
        anchor.setName("First Chapter");

        // Second parameter is the number of the chapter
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("Subcategory 1", subFont);
        Section subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Hello"));

        subPara = new Paragraph("Subcategory 2", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Paragraph 1"));
        subCatPart.add(new Paragraph("Paragraph 2"));
        subCatPart.add(new Paragraph("Paragraph 3"));

        // add a list
        createList(subCatPart);
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 5);
        subCatPart.add(paragraph);

        // add a table
        createTable(subCatPart);

        // now add all this to the document
        document.add(catPart);

        // Next section
        anchor = new Anchor("Second Chapter", catFont);
        anchor.setName("Second Chapter");

        // Second parameter is the number of the chapter
        catPart = new Chapter(new Paragraph(anchor), 1);

        subPara = new Paragraph("Subcategory", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("This is a very important message"));

        // now add all this to the document
        document.add(catPart);

    }

    private static void createTable(Section subCatPart)
            throws BadElementException {
        PdfPTable table = new PdfPTable(3);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);
        PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 2"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 3"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        table.addCell("1.0");
        table.addCell("1.1");
        table.addCell("1.2");
        table.addCell("2.1");
        table.addCell("2.2");
        table.addCell("2.3");

        subCatPart.add(table);

    }

    private static void createList(Section subCatPart) {
        List list = new List(true, false, 10);
        list.add(new ListItem("First point"));
        list.add(new ListItem("Second point"));
        list.add(new ListItem("Third point"));
        subCatPart.add(list);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

}
