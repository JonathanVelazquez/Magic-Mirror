
import java.io.IOException;

import javax.xml.bind.JAXBException;


import com.github.fedy2.weather.*;
import com.github.fedy2.weather.data.*;
import com.github.fedy2.weather.data.unit.*;

public  class weather {
	  static date todayDate = new date();
	  
	 public static String cWeather = null;
	
public  static void main(String args[]) throws JAXBException, IOException{
	System.out.println(weatherToString());
	
}
	void getWeather() throws JAXBException, IOException{
		YahooWeatherService service = new YahooWeatherService();
		Channel channel = service.getForecast("2367188", DegreeUnit.FAHRENHEIT);
		service.getForecast("2367188", DegreeUnit.FAHRENHEIT);
	}
	 static void todayWeather() throws JAXBException, IOException
	{
		YahooWeatherService service = new YahooWeatherService();
		System.out.println(service.getForecast("2367188", DegreeUnit.FAHRENHEIT));
		
		String today = todayDate.getDayofWeek().substring(0,2);
		
	}
	public static  String weatherToString() throws JAXBException, IOException
	{
		
		YahooWeatherService service = new YahooWeatherService();
		
		Channel channel = service.getForecast("2367188", DegreeUnit.FAHRENHEIT);
		
		String toString = channel.getItem() + "";
		System.out.println(channel.getDescription());
		return toString;
		
		
	}
	public  String currentConditions() throws JAXBException, IOException
	{
		String data[] ={"Mostly Cloudy", "Mostly Clear","Mostly Sunny","Partly Cloudy", "Cloudy", "Sunny", "Rain" };

		String currentWeather =weatherToString();
		//System.out.println(currentWeather);
	      
		int intIndex = currentWeather.indexOf("Current Conditions:");
	      if(intIndex == - 1)
	      {
	         System.out.println("Weather not found");
	      }else
	      {
	        // System.out.println("Found Weather at index "
	        // + intIndex);
	      }
	      
	      String weather = currentWeather.substring(intIndex, intIndex+45);
	      System.out.println(weather);
	      
	      System.out.println(weather);
	     
	      
	      for(int i = 0; i<=data.length-1; i++)
	      {
	    	  if( weather.contains(data[i]))
	    	  {
	    		  cWeather=data[i];
	    		break;
	    	  }
	    	  //break;
	      }
	      //System.out.println(cWeather);
		return cWeather;
	}
	public String todayHigh(){
		date today = new date();
		today.getDay();
		 
        String dayString=today.getDay();
        if(dayString=="Monday"){
        	dayString="Mon";
        }else if(dayString=="Tuesday"){
        	dayString="Tue";
        }else if(dayString=="Wednesday"){
        	dayString="Wed";
        }else if(dayString=="Thursday"){
        	dayString="Thu";
        }else if(dayString=="Friday"){
        	dayString="Friday";
        }else if(dayString=="Saturday"){
        	dayString="Sat";
        }

        return dayString;
		//jreturn 0;
	}
	public int currentTemp() throws JAXBException, IOException{
		int retVal =0;
		String retVal2=null;
		String currentWeather =weatherToString();
		
		int intIndex = currentWeather.indexOf("temp=");
	      if(intIndex == - 1)
	      {
	         System.out.println("Weather not found");
	      }else
	      {
	        // System.out.println("Found Weather at index "
	        // + intIndex);
	      }
	      retVal2 = currentWeather.substring(intIndex+7,intIndex+8);
	      
	      System.out.println(retVal2);
	      
	      if(retVal2.equals(",")){
	    	  String current = currentWeather.substring(intIndex+5,intIndex+7);
	    	  retVal = Integer.parseInt(current);
	      }
		return retVal;
	}
}


