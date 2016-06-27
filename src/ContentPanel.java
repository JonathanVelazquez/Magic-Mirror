import java.awt.Graphics;
import java.io.IOException;

import javax.xml.bind.JAXBException;

@SuppressWarnings("serial")
class ContentPanel extends datePanel {
	weather currentWeather = new weather();
	// String weather = currentWeather.currentConditions()+;

	public ContentPanel() throws JAXBException, IOException {
		super("Bothell, WA " + new weather().currentConditions() + " " + new weather().currentTemp() + "F");
	}

	public String getTemp() {
		try {
			return new weather().currentTemp() + "°F";
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		return "UNABLE TO RETRIEVE TEMP";
	}
	public String toString() {
		String retVal = "";

		try {

			retVal += "<html><center><u>Current Weather</u> <br><br> <center>Bothell, WA<br>"
					+ new weather().currentConditions() + " " + new weather().currentTemp() + "°F</html>";
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return retVal;
	}
}