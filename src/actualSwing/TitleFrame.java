package actualSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class TitleFrame extends JFrame {
	JButton loginButton;
	JLabel titleLable;
	public boolean nextFrame = false;
	
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	TitleFrame(){
		//ImageIcon image = new ImageIcon("Calendar1.jpg");
		
		
		titleLable = new JLabel();
		titleLable.setText("Welcome To CU Later");
		//titleLable.setIcon(image);
		titleLable.setHorizontalTextPosition(JLabel.CENTER);
		titleLable.setVerticalTextPosition(JLabel.TOP);
		titleLable.setVerticalAlignment(JLabel.CENTER);
		titleLable.setHorizontalAlignment(JLabel.CENTER);
		titleLable.setBounds(100,100,250,250);
		titleLable.setFont(new Font("MV Boli", Font.PLAIN, 20));
		//titleLable.setIconTextGap(-25);
		
		loginButton = new JButton();
		loginButton.setBounds(100,300,250,50);
		loginButton.addActionListener(e -> this.setVisible(false));
		loginButton.setText("Login");
		loginButton.setFocusable(false);
		loginButton.setBackground(Color.LIGHT_GRAY);
		
		this.setTitle("CU Later");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(titleLable);
		this.add(loginButton);
		
		this.setLayout(null);
		
		
		this.getContentPane().setBackground(new Color(0xF5F5DC));
	}
	
	public boolean getFrame() {
		return this.nextFrame;
	}
	
}
