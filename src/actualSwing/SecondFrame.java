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
	JPanel redPanel;
	JPanel bluePanel;
	JTextField textFieldTime;
	JButton submitTimeButton;
		
	SecondFrame() {
			
		redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 300, 600);
		
		bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(300, 0, 300, 600);
			
		label = new JLabel();
		label.setText("What is your name?");
		label.setForeground(Color.black);
			
			
		submitTimeButton = new JButton();
		textFieldTime =  new JTextField();
		textFieldTime.setPreferredSize(new Dimension(250,40));
			
		
			
		submitTimeButton = new JButton("Time");
		textFieldTime =  new JTextField();
		textFieldTime.setPreferredSize(new Dimension(250,40));
			
			
			
		this.getContentPane().setBackground(new Color(0xF5F5DC));
		this.add(label);
		bluePanel.add(submitTimeButton);
		bluePanel.add(textFieldTime);
		this.add(redPanel);
		this.add(bluePanel);
		this.setVisible(true);
		this.setTitle("Get User Input");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

	}

