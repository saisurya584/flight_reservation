package com.flight_reservation_app.utilities;


import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.flight_reservation_app.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
@Component
public class PdfGenerator {
	
	public void generateItinerary(Reservation reser ,String filePath) {
		
		Document document=new Document();
		

       
		try
		{
			 
			PdfWriter.getInstance(document,new FileOutputStream(filePath));
			
			document.open();
			Paragraph p = new Paragraph();
	 
	        Font f = new Font();
          f.setStyle(Font.BOLD);
            f.setSize(8);
            document.add(new Paragraph("TICKET DETAILS", f));
            p.setAlignment(Element.ALIGN_CENTER);
			document.add(generateTable(reser));
			document.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private  PdfPTable generateTable(Reservation reser)
	{
		PdfPTable table=new PdfPTable(2);
		PdfPCell cell;
		
		cell=new PdfPCell(new Phrase("Flight Itinerary"));
		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		
		table.addCell("Departure City");
		table.addCell(reser.getFlight().getDepartureCity());
		
		table.addCell("Arrival City");
		table.addCell(reser.getFlight().getArrivalCity());
		
		table.addCell("Flight Number");
		table.addCell(reser.getFlight().getFlightNumber());
		
		table.addCell("Operating Airline");
		table.addCell(reser.getFlight().getOperatingAirlines());
		
		table.addCell("Departure Date");
		table.addCell(reser.getFlight().getDateOfDeparture().toString());
		
		table.addCell("Departure time");
		table.addCell(reser.getFlight().getEstimatedDepartureTime().toString());
		
		cell=new PdfPCell(new Phrase("Passenger Details"));
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("First Name");
		table.addCell(reser.getPassenger().getFirstName());
		
		table.addCell("Last Name");
		table.addCell(reser.getPassenger().getLastName());
		
		table.addCell("Middle Name");
		table.addCell(reser.getPassenger().getMiddleName());
		
		table.addCell("Email");
		table.addCell(reser.getPassenger().getEmail());
		
		table.addCell("Phone");
		table.addCell(reser.getPassenger().getPhone());
		
		return table;
	}

}
