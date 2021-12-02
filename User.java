package userinput;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class User {
	
	public static void main(String[] args) {
		
		
		//label creating
		JLabel label = new JLabel();
		label.setText("What is your name?");
		//label.setHorizontalTextPosition(JLabel.CENTER);
		//label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.black);
		
		//creates panel
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 300, 600);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(300, 0, 300, 600);
		
		
		
		
		
		//creates frame
		JFrame frame = new JFrame();
		
		//creates the title
		frame.setTitle("Get User Input");
		
		//allows it to close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets the size
		frame.setSize(600, 600);
		
		//sets the visibility
		frame.setVisible(true);
		
		
		
		//color of frame
		frame.getContentPane().setBackground(new Color(0xF5F5DC));
		
		//adds the label
		frame.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
	}

}
