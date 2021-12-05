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
	JButton loginButton;
	JLabel titleLable;
	JLabel catchline;
	//JLabel Background;

	// BackGround Image
	JPanel contentPane = new JPanel() {
		public void paintComponent(Graphics g) {
			Image img = Toolkit.getDefaultToolkit().getImage(
					this.getClass().getResource("src/actualSwing/schedule.jpeg"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		}

	};

	Border border = BorderFactory.createLineBorder(Color.green, 3);
	public Frame() throws IOException {

		//ImageIcon img1 = new ImageIcon("actualSwing/schedule.jpeg");
		//Background = new JLabel("",img,JLabel.CENTER);
		//Background.setBounds(0,0,480,500);

		titleLable = new JLabel();
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

		
		loginButton = new JButton();
		loginButton.setBounds(100,300,250,50);
		loginButton.addActionListener(this);
		loginButton.setText("Login");
		loginButton.setFocusable(false);
		loginButton.setBackground(Color.LIGHT_GRAY);
		loginButton.setFont(font);
		//trying to add some graphics


		this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/Users/saurabhagrawal/Desktop/cs151/group_proj/src/actualSwing/sched1.jpeg")))));
		this.setVisible(true);
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
		// To Add BackGround Image
		//this.add(Background);
		//this.setLocation
		//this.getContentPane().setBackground(new Color(0x8BE30606, true));

		//this.getContentPane().add(contentPane) ;

	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == loginButton) {
			this.dispose();
			try {
				SecondFrame second = new SecondFrame();
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
		
	}



//	public void paint(Graphics g) {
//		Graphics2D circle = (Graphics2D) g;
//		
//		circle.setPaint(Color.magenta);
//		circle.fillOval(0, 0, 100, 100);
//	}


	
}
