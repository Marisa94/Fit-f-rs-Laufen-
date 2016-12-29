package SEProjekt;

import java.io.FileOutputStream;
import java.util.Date;

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
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Ausgabe {
	// saving location 
	static String FILE = "C:/Users/Default/Documents/Fit_Fürs_Laufen.pdf";
	// different fonts 
    static Font Heading1 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    static Font Heading2 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    static Font Text = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
    
    // Classification Data of PDF
    public void addMetaData(Document document) {
        document.addTitle("Fit Fürs Laufen");
        document.addAuthor("Laura Wolter, Marisa Keil");
        document.addCreator("Laura Wolter, Marisa Keil");
    }
    
    public void addContent(Document document) throws DocumentException{
    	// Heading chepter 1
    	Anchor anchor = new Anchor("Fit fürs Laufen", Heading1);
        anchor.setName("Fit fürs Laufen");
        Chapter ChaPart1 = new Chapter(new Paragraph(anchor), 1);
        Paragraph Woche = new Paragraph("Woche 1", Heading2);
        Section Table = ChaPart1.addSection(Woche);
        
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 1);
        Woche.add(paragraph);
        
        createTable(Table);
        
        document.add(ChaPart1);    
    	
    }

    public void createTable(Section subPart) throws BadElementException{
    	
    	PdfPTable table = new PdfPTable(7);

        PdfPCell c1 = new PdfPCell(new Phrase("Montag"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Dienstag"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Mittwoch"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        c1 = new PdfPCell(new Phrase("Donnerstag"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        c1 = new PdfPCell(new Phrase("Freitag"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        c1 = new PdfPCell(new Phrase("Samstag"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        c1 = new PdfPCell(new Phrase("Sonntag"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        table.setHeaderRows(1);
        
        table.addCell("");
        table.addCell("");
        table.addCell("");
        table.addCell("");
        table.addCell("");
        table.addCell("");
        table.addCell("");
        
        subPart.add(table);
    }
    
    public void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
                paragraph.add(new Paragraph(" "));
        }
    }  


}
