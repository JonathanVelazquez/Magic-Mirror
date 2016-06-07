import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

abstract class datePanel extends JPanel {
   private static final float FONT_SIZE = 100f;
 
   
   private JButton next = new JButton("Next");
 
   public datePanel(String name,Graphics g) {
	   
      setName(name);
      JLabel label = new JLabel(getName(), SwingConstants.CENTER);
      label.setLayout(null);
      
      label.setFont(label.getFont().deriveFont(Font.BOLD, FONT_SIZE));

	  label.setForeground(Color.white);
	 
 
      JPanel btnPanel = new JPanel(new GridBagLayout());
      btnPanel.add(next);
 
      setLayout(new BorderLayout());
      setBackground(Color.black);
      add(btnPanel, BorderLayout.SOUTH);
      add(label, BorderLayout.CENTER);
   }
 
   public void addNextActionListener(ActionListener listener) {
      //next.addActionListener(listener);
	 //  next.getActionMap().put("A_pressed", next);
}
}