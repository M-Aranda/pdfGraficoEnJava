/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.io.File;
import com.itextpdf.io.image.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.text.pdf.PdfContentByte;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
 *
 * @author Chelo
 */
public class AgregarImagenAPDFHandler {
    
    public void agregarImagen(String rutaPDF, String rutaImagen) throws FileNotFoundException, MalformedURLException{
            File file = new File(rutaPDF);

            PdfWriter pdfWriter = new PdfWriter(rutaPDF);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);

            Document document = new Document(pdfDocument);
            ImageData imageData = ImageDataFactory.create(rutaImagen);

            Image pdfImg = new Image(imageData);

            pdfImg.setFixedPosition(420, 690);
            pdfImg.scaleAbsolute(110, 140);
            document.add(pdfImg);
            document.close();
            pdfDocument.close();



    }
    
}
