package ufv.dis.parcialfinal.pr29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneradorPDF {
	public void add_usuario(Usuario p) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream((p.getName()+p.getSurname())));
		document.open();
		document.add(new Paragraph("Hello World!"));
		document.close();
	}

}
