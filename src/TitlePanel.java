import java.awt.Graphics;
import java.io.IOException;

import javax.xml.bind.JAXBException;

@SuppressWarnings("serial")
class TitlePanel extends datePanel {
	static date one = new date();
	static String date = one.getDayofWeek()+", " + one.getMonth() +" "+ one.getDay();
	static String NAME = date;
 
	public TitlePanel(Graphics g) throws JAXBException, IOException{
		super(NAME);
    }
   
    public String toString() {
	    String retVal = "";
			   
	    retVal += "<html>" + date + "<br>" + "<P ALIGN=RIGHT>" + one.getTime() + "<br>" + getTemp() + "</P></html>";
		//System.out.println("TIME: " + one.getTime());
	    return retVal;
    }
    
    public String getTemp() {
    	String temp = "";
    	
    	ContentPanel temperature = null;
    	try {
			temperature = new ContentPanel();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return temperature.getTemp();
    }
 
}