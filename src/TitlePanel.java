import java.awt.Graphics;

@SuppressWarnings("serial")
class TitlePanel extends datePanel {
	static date one = new date();
	
	  
	 static String date = one.getDayofWeek()+", " + one.getMonth() +" "+ one.getDay();
	
   static String NAME = date;
 
   public TitlePanel(Graphics g) {
      super(NAME, g);
   }
 
}