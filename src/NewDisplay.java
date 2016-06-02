import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
	            final JFrame jFrame = new JFrame() {
	                {
	                    final PanelSlider42<JFrame> slider = new PanelSlider42<JFrame>(this);
	                    final JPanel jPanel = slider.getBasePanel();

	                    TitlePanel titleView = new TitlePanel(null);
	                   
	                    ContentPanel contentView = null;
	                    
	                    try {
	                    	contentView = new ContentPanel(null);
	                	} catch (JAXBException | IOException e) {
	                		e.printStackTrace();
	                	}
	                    
	                    Color color = new Color(100, 0, 255);
	                    
	                    //creates the date display
	                    JButton date = new JButton(titleView.toString());
	                    date.setFont(new Font("Helvetica", Font.BOLD, 50));
	                    date.setForeground(color);
	                    date.setVerticalAlignment(SwingConstants.TOP);
	                    
	                    //creates the weather display
	                    JButton weather = new JButton(contentView.toString());
	                    weather.setFont(new Font("Helvetica", Font.BOLD, 30));
	                    weather.setForeground(color);
	                    weather.setVerticalAlignment(SwingConstants.TOP);
	                    
	                    JScrollPane scroller = new JScrollPane(jPanel);
	                    //adds each button to the display
	                    slider.addComponent(date);
	                    //slider.addComponent(new JButton("22"));
	                    slider.addComponent(weather);
	                    slider.addComponent(new JButton("333"));
	                    slider.addComponent(new JButton("4444"));

	                    //sets the default display
	                    getContentPane().add(jPanel);
	                    setSize(700, 700);
	                    setLocationRelativeTo(null);
	                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                    setVisible(true);
	                }
	            };
	        }
	    });
	}
}
