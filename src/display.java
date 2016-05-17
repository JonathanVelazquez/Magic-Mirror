/*
import java.applet.*;
import java.awt.*;





public class display extends Applet
{
	
	
	
   public void paint (Graphics g)
   {
	   
	   setBackground(Color.black);
	  //date object
	  date one = new date();

	  int fontSize = 30;
	  g.setFont(new Font("", Font.PLAIN, fontSize));
	  
	  g.setColor(Color.white);
	 int inth = (28 % 10);
	 
	 
	  String date = one.getDayofWeek()+", " + one.getMonth() +" "+ one.getDay();
	  g.drawString(inth+"", 50, 50);
	  g.drawString(date, 100, 100);
	  
	  
      //g.drawString (one.getDate(), 50, 50);
	  

       
     
   }
}
*/

import java.awt.BorderLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.xml.bind.JAXBException;
 
@SuppressWarnings("serial")
public class display extends JApplet {
	// declaring the card view independently 
   private TitlePanel titleView;
   private ContentPanel contentView;
   private PageThree pageView;
   
   //Card layout is what allows to have multiple windows
   private CardLayout cardlayout = new CardLayout();
 
   public void init() {
      setLayout(cardlayout);
   
      ActionListener buttonListener = new ActionListener() {
          
         @Override
         public void actionPerformed(ActionEvent arg0) {
            cardlayout.next(getContentPane());
         }
      };
 
      // Three cards have been added here. They have to be declared globally first.
      
      titleView = new TitlePanel(null);
      titleView.addNextActionListener(buttonListener);
      try {
		contentView = new ContentPanel(null);
	} catch (JAXBException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      contentView.addNextActionListener(buttonListener);
      pageView = new PageThree(null);
      pageView.addNextActionListener(buttonListener);
      
      add(titleView, titleView.getName());
      
      add(contentView, contentView.getName());
      add(pageView,pageView.getName());
 
   }
   
}
 

 


