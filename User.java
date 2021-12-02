package userinput;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class User {
	
	public static void main(String[] args) {
		
		
		//label creating
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Name:");
		nameLabel.setHorizontalTextPosition(JLabel.CENTER);
		nameLabel.setVerticalTextPosition(JLabel.TOP);
		nameLabel.setVerticalAlignment(JLabel.CENTER);
		nameLabel.setHorizontalAlignment(JLabel.LEFT);
		nameLabel.setBounds(10, 10, 250, 250);
		nameLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
		nameLabel.setForeground(Color.black);
		
		JLabel nameLabel2 = new JLabel();
		nameLabel2.setText("Name:");
		nameLabel2.setHorizontalTextPosition(JLabel.CENTER);
		nameLabel2.setVerticalTextPosition(JLabel.TOP);
		nameLabel2.setVerticalAlignment(JLabel.CENTER);
		nameLabel2.setHorizontalAlignment(JLabel.LEFT);
		nameLabel2.setBounds(10, 10, 250, 250);
		nameLabel2.setFont(new Font("MV Boli", Font.PLAIN, 20));
		nameLabel2.setForeground(Color.black);
		
		//store date object in second frame as two integers one for month one for date
		JLabel dateLabel = new JLabel();
		dateLabel.setText("Date:");
		dateLabel.setHorizontalTextPosition(JLabel.CENTER);
		dateLabel.setVerticalTextPosition(JLabel.TOP);
		dateLabel.setVerticalAlignment(JLabel.CENTER);
		dateLabel.setHorizontalAlignment(JLabel.LEFT);
		dateLabel.setBounds(10, 80, 250, 250);
		dateLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
		dateLabel.setForeground(Color.black);
		
		JLabel dateLabel2 = new JLabel();
		dateLabel2.setText("Date:");
		dateLabel2.setHorizontalTextPosition(JLabel.CENTER);
		dateLabel2.setVerticalTextPosition(JLabel.TOP);
		dateLabel2.setVerticalAlignment(JLabel.CENTER);
		dateLabel2.setHorizontalAlignment(JLabel.LEFT);
		dateLabel2.setBounds(10, 80, 250, 250);
		dateLabel2.setFont(new Font("MV Boli", Font.PLAIN, 20));
		dateLabel2.setForeground(Color.black);
		
		//creates panel
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 500, 1000);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(500, 0, 500, 1000);
		
		
		
		
		
		//creates frame
		JFrame frame = new JFrame();
		
		//creates the title
		frame.setTitle("Get User Input");
		
		//allows it to close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets the size
		frame.setSize(1000, 1000);
		
		//sets the visibility
		frame.setVisible(true);
		
		
		
		//color of frame
		frame.getContentPane().setBackground(new Color(0xF5F5DC));
		
		//adds the label
		redPanel.add(nameLabel);
		bluePanel.add(nameLabel2);
		
		redPanel.add(dateLabel);
		bluePanel.add(dateLabel2);
		
		frame.add(redPanel);
		frame.add(bluePanel);
	}

}
