package ufv.dis.parcialfinal.pr29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneradorPDF {
	public static void add_usuario(Usuario p) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(("pdf/"+p.getName()+p.getSurname())+".pdf"));
		document.open();
		document.add(new Paragraph("name: "+ p.getName()));
		document.add(new Paragraph("Surname: "+ p.getSurname()));
		document.add(new Paragraph("Brtihdate: "+ p.getBirthdate()));
		document.add(new Paragraph("DNI: "+ p.getDNI()));
		document.add(new Paragraph("age: "+ p.getAge()));
		document.add(new Paragraph("adut: "+ p.isAdult()));
		document.close();
	}
}
