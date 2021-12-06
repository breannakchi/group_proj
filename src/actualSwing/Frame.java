package actualSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;


public class Frame extends JFrame implements ActionListener {
	// Initialize different types of label and button
	JButton loginButton;
	JLabel titleLable;
	JLabel catchline;

	Border border = BorderFactory.createLineBorder(Color.green, 3);
	public Frame() throws IOException {

		titleLable = new JLabel();
		// To add the font for the text
		Font font = new Font("Courier", Font.BOLD,12);
		titleLable.setFont(font);
		titleLable.setText("Welcome To CUL8R :)");
		//titleLable.setIcon(image);
		titleLable.setHorizontalTextPosition(JLabel.CENTER);
		titleLable.setVerticalTextPosition(JLabel.TOP);
		titleLable.setVerticalAlignment(JLabel.CENTER);
		titleLable.setHorizontalAlignment(JLabel.CENTER);
		titleLable.setBounds(105,30,250,250);
		titleLable.setFont(new Font("MV Boli", Font.PLAIN, 24));
		//titleLable.setIconTextGap(-25);
		//titleLable.setIcon(img1);


		catchline = new JLabel();
		catchline.setFont(font);
		catchline.setText("Making Meeting Up Easier");

		//titleLable.setIcon(image);
		catchline.setHorizontalTextPosition(JLabel.CENTER);
		catchline.setVerticalTextPosition(JLabel.TOP);
		catchline.setVerticalAlignment(JLabel.CENTER);
		catchline.setHorizontalAlignment(JLabel.CENTER);
		catchline.setBounds(100,120,250,250);
		catchline.setFont(new Font("MV Boli", Font.PLAIN, 14));

		// Working on Login button
		loginButton = new JButton();
		loginButton.setBounds(100,300,250,50);
		loginButton.addActionListener(this);
		loginButton.setText("Login");
		loginButton.setFocusable(false);
		loginButton.setBackground(Color.LIGHT_GRAY);
		loginButton.setFont(font);
		//trying to add some graphics


		// Reading the file image location
		//Make sure to change  pathname according to your file location. Otherwise the code will not run properly.
		this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/Users/saurabhagrawal/Desktop/cs151/group_proj/src/actualSwing/sched1.jpeg")))));
		this.setVisible(true);
		// Title for our front page.
		this.setTitle("CUL8R");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		// Intialise the fix size for first frame;
		this.setSize(480,500);
		this.setVisible(true);
		this.add(titleLable);
		this.add(catchline);
		this.add(loginButton);
		this.setLocationRelativeTo(null);

		this.setLayout(null);
		// To Add BackGround Background color if we background image is not required.
		//this.getContentPane().setBackground(new Color(0x8BE30606, true));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Action will be performed to open the second frame when login button will be clicked
		if(e.getSource() == loginButton) {
			this.dispose();
			// Try-catch method
			try {
				SecondFrame second = new SecondFrame();
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
		
	}
	
}
