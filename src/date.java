import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

	//getting day of week "MONDAY/Tuesday/etc.... as a string
	String getDayofWeek(){
		Calendar now = Calendar.getInstance();
	    
	    String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
	        "Friday", "Saturday" };
	    
	    // Day_OF_WEEK starts from 1 while array index starts from 0
	    String day = strDays[now.get(Calendar.DAY_OF_WEEK) - 1];
	    return day;
	}
	String getDay(){
		String day = new SimpleDateFormat("d").format(new Date());;
		int dayEnding = Integer.parseInt(day);
		
		
        String dayEnd;
        switch (dayEnding%10) {
            case 1:  dayEnd = "st";
                     break;
            case 2:  dayEnd = "nd";
                     break;
            case 3:  dayEnd = "rd";
                     break;
            case 4:  dayEnd = "th";
                     break;
            case 5:  dayEnd = "th";
                     break;
            case 6:  dayEnd = "th";
                     break;
            case 7:  dayEnd = "th";
                     break;
            case 8:  dayEnd = "th";
                     break;
            case 9:  dayEnd = "th";
                     break;
            case 10: dayEnd = "th";
            		 break;
            default: dayEnd = "Invalid day";
                     break;
        }
        
        
        return day +dayEnd+"" ;
    }

		

		
		
		
		
	
		
	
	
	String getMonth(){
		
		
		 String m = new SimpleDateFormat("MM").format(new Date());
		 int month = Integer.parseInt(m);
		 
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        return monthString;
    }

	
	String getYear(){
		String year = new SimpleDateFormat("yyyy").format(new Date());;
		
		return year;
	}
	
	String getDate(){
		
		date test = new date();
		String date = test.getDayofWeek() + ","+test.getMonth() +","+ test.getDay();
		return date;
		
	}
	String getTime(){
		String time = "";
		
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
        time  += sdf.format(cal.getTime()) ;

		return time;
		
	}
	
}
