import java.awt.Graphics;
import java.io.IOException;

import javax.xml.bind.JAXBException;

@SuppressWarnings("serial")
class TitlePanel extends datePanel {
	static date one = new date();
	static date two = new date();
	
	  
	 static String date = one.getDayofWeek()+", " + one.getMonth() +" "+ one.getDay();
	 static String date2 = two.getTime();
	
   static String NAME = date;
 
   public TitlePanel(Graphics g) throws JAXBException, IOException{
      super(NAME, g);
   }
   
   public String toString() {
	   String retVal = "";
	   
	   
			   
			   retVal += "<html><br><br><br><center>"+ date+"<br><br>"+System.currentTimeMillis()+" <br><br>  <ce<br></html>";
			   
			   
	   return retVal;
   }
 
}