//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.xml.bind.JAXBException;

public class NewDisplay {
	static public void main(final String[] args) throws Exception {
	    SwingUtilities.invokeAndWait(new Runnable() {
	        @Override
	        public void run() {
	             try {
					JFrame jFrame = new JFrame() {
					    {
					    	this.setBackground(Color.black);
					         PanelSlider42<JFrame> slider = new PanelSlider42<JFrame>(this);

					      
					         JPanel jPanel = slider.getBasePanel();
					        jPanel.setBackground(Color.black);

					        //getContentPane().setBackground( Color.black );
					        
					        TitlePanel titleView = new TitlePanel(null);
					        
					        titleView.setBackground(Color.black);
					       
					        ContentPanel contentView = null;
					       // contentView.setBackground(Color.BLACK);
					        
					        try {
					        	contentView = new ContentPanel(null);
					        	
					    	} catch (JAXBException | IOException e) {
					    		e.printStackTrace();
					    	}
					        contentView.setBackground(Color.black);
					        Color color = new Color(100, 0, 255);
					        
					        //creates the date display
					        JButton date = new JButton(titleView.toString());
					        date.setBackground(Color.black);
					        date.setFont(new Font("Helvetica", Font.BOLD, 70));
					        date.setForeground(Color.BLACK);
					        date.setVerticalAlignment(SwingConstants.TOP);
					        date.setBackground(Color.black);
					        //date.setForeground(Color.black);
					        this.setBackground(Color.black);
					        //date.setOpaque(true);
					        
					        //creates the weather display
					        JButton weather = new JButton(contentView.toString());
					        weather.setFont(new Font("Helvetica", Font.BOLD, 70));
					        weather.setForeground(Color.BLACK);
					        weather.setVerticalAlignment(SwingConstants.TOP);
					        weather.setBorderPainted(true);
					        weather.setBackground(Color.BLACK);
					        
					        JScrollPane scroller = new JScrollPane(jPanel);
					        scroller.setBackground(Color.black);
					        //adds each button to the display
					        slider.addComponent(date);
					       
					        //slider.addComponent(new JButton("22"));
					        
					        slider.addComponent(weather);
					       // slider.addComponent(new JButton("333"));
					       // slider.addComponent(new JButton("4444"));
					       // slider.
					        //sets the default display
					        getContentPane().add(jPanel);
					        setSize(700, 700);
					        setLocationRelativeTo(null);
					        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					        setVisible(true);
					        
					    }
					};
				} catch (HeadlessException | JAXBException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    });
	}
}
