package actualSwing;


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SecondFrame extends JFrame implements ActionListener {
	JLabel label;
	JPanel beigePanel;
	JPanel whitePanel;
	JTextField textFieldStartHour;
	JTextField textFieldStartMinute;
	JTextField textFieldEndHour;
	JTextField textFieldEndMinute;
	JButton startHourButton;
	JButton nameButton;
	JButton startMinuteButton;
	JButton endMinuteButton;
	JButton endHourButton;
	JButton addButton;
		
	SecondFrame() {
		//Left Panel	
		beigePanel = new JPanel();
		beigePanel.setBackground(new Color(0xF5F5DC));
		beigePanel.setBounds(0, 0, 300, 600);
		
		//Right Panel
		whitePanel = new JPanel();
		whitePanel.setBackground(Color.white);
		whitePanel.setBounds(300, 0, 300, 600);
			
			
		//Start Hour Button	
		startHourButton = new JButton("Submit Start Hour");
		startHourButton.addActionListener(this);
		startHourButton.setFocusable(false);
		startHourButton.setBackground(Color.LIGHT_GRAY);
		startHourButton.setBounds(100,100,50,50);
		
		//Start Hour Button	
		endHourButton = new JButton("Submit End Hour");
		endHourButton.addActionListener(this);
		endHourButton.setFocusable(false);
		endHourButton.setBackground(Color.LIGHT_GRAY);
		endHourButton.setBounds(100,100,50,50);
		
		//Start Minute Button
		startMinuteButton = new JButton("Submit Start Min");
		startMinuteButton.addActionListener(this);
		startMinuteButton.setFocusable(false);
		startMinuteButton.setBackground(Color.LIGHT_GRAY);
		startMinuteButton.setBounds(250,250,250,250);
		
		//End Minute Button
		endMinuteButton = new JButton("Submit End Min");
		endMinuteButton.addActionListener(this);
		endMinuteButton.setFocusable(false);
		endMinuteButton.setBackground(Color.LIGHT_GRAY);
		endMinuteButton.setBounds(250,250,250,250);
		
		//Name Button
		//nameButton = new JButton("Enter name");
		//nameButton.addActionListener(this);
		//nameButton.setFocusable(false);
		//nameButton.setBackground(Color.LIGHT_GRAY);
		
		//Text Field for starting hour
		textFieldStartHour =  new JTextField();
		textFieldStartHour.setPreferredSize(new Dimension(150,40));
		textFieldStartHour.setBounds(150,150,150,150);
		
		//Text Field for ending hour
		textFieldEndHour =  new JTextField();
		textFieldEndHour.setPreferredSize(new Dimension(150,40));
		textFieldEndHour.setBounds(150,150,150,150);
		
		//Text Field for starting minute
		textFieldStartMinute = new JTextField();	
		textFieldStartMinute.setPreferredSize(new Dimension(150,40));
		textFieldStartMinute.setBounds(250, 250, 250, 250);
		
		//Text Field for ending minute
		textFieldEndMinute = new JTextField();	
		textFieldEndMinute.setPreferredSize(new Dimension(150,40));
		textFieldEndMinute.setBounds(250, 250, 250, 250);
			
		this.getContentPane().setBackground(new Color(0xF5F5DC));
		//this.add(label);
		this.add(beigePanel);
		this.add(whitePanel);
		this.setVisible(true);
		this.setTitle("Get User Input");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		
		whitePanel.add(startHourButton);
		whitePanel.add(endHourButton);
		
		whitePanel.add(textFieldStartHour);
		whitePanel.add(textFieldEndHour);
		whitePanel.add(textFieldStartMinute);
		whitePanel.add(textFieldEndMinute);
		
		
		whitePanel.add(startMinuteButton);
		whitePanel.add(endMinuteButton);
		
		//whitePanel.add(nameButton);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			String startMinute = "";
			int startM = -1;
			int startH = -1;
			//name button
			if(e.getSource() == startMinuteButton) {
				 startMinute = textFieldStartMinute.getText();
				 startM = Integer.parseInt(startMinute);
				 System.out.println(startM);
				
			}
			
			
			String startHour = "";
			//submit
			if(e.getSource() == startHourButton) {
				 startHour = textFieldStartHour.getText();
				 startH = Integer.parseInt(startHour);
				 System.out.println(startH);
			}
			
			
			
		}
}
			
			


