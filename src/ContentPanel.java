import java.awt.Graphics;
import java.io.IOException;

import javax.xml.bind.JAXBException;

@SuppressWarnings("serial")
class ContentPanel extends datePanel {
	weather currentWeather = new weather();
	 // String weather = currentWeather.currentConditions()+;

  
 
   public ContentPanel(Graphics g) throws JAXBException, IOException {
	   
	  
     
	  super("Bothell, WA \n"+ new weather().currentConditions() + " "+new weather().currentTemp() +"°F", g);
	 
   }
}