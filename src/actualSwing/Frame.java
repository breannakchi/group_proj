package actualSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame implements ActionListener {
	JButton loginButton;
	JLabel titleLable;
	JLabel catchline;
	
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	Frame(){
		//ImageIcon image = new ImageIcon("Calendar1.jpg");
		
		
		titleLable = new JLabel();
		titleLable.setText("Welcome To CUL8R :)");
		//titleLable.setIcon(image);
		titleLable.setHorizontalTextPosition(JLabel.CENTER);
		titleLable.setVerticalTextPosition(JLabel.TOP);
		titleLable.setVerticalAlignment(JLabel.CENTER);
		titleLable.setHorizontalAlignment(JLabel.CENTER);
		titleLable.setBounds(105,80,250,250);
		titleLable.setFont(new Font("MV Boli", Font.PLAIN, 24));
		//titleLable.setIconTextGap(-25);
		
		catchline = new JLabel();
		catchline.setText("Making Meeting Up Easier");
		//titleLable.setIcon(image);
		catchline.setHorizontalTextPosition(JLabel.CENTER);
		catchline.setVerticalTextPosition(JLabel.TOP);
		catchline.setVerticalAlignment(JLabel.CENTER);
		catchline.setHorizontalAlignment(JLabel.CENTER);
		catchline.setBounds(100,120,250,250);
		catchline.setFont(new Font("MV Boli", Font.PLAIN, 14));

		
		loginButton = new JButton();
		loginButton.setBounds(100,300,250,50);
		loginButton.addActionListener(this);
		loginButton.setText("Login");
		loginButton.setFocusable(false);
		loginButton.setBackground(Color.LIGHT_GRAY);
		
		//trying to add some graphics
		
		
		
		this.setTitle("CUL8R");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(480,500);
		this.setVisible(true);
		this.add(titleLable);
		this.add(catchline);
		this.add(loginButton);
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);
		
		
		this.getContentPane().setBackground(new Color(0xF5F5DC));
		
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == loginButton) {
			this.dispose();
			SecondFrame second = new SecondFrame();
		}
		
	}
	
//	public void paint(Graphics g) {
//		Graphics2D circle = (Graphics2D) g;
//		
//		circle.setPaint(Color.magenta);
//		circle.fillOval(0, 0, 100, 100);
//	}
	
}
