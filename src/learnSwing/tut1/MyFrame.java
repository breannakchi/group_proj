package learnSwing.tut1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Frame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        this.setResizable(false); //prevents the user from resizing the frame
        this.setSize(420,420);//sets the x and y dimension of the frame
        this.setVisible(true);//makes the frame visible

        ImageIcon image = new ImageIcon("frameIcon.png");//create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0, 0, 0));//change background color of the frame

    }
}
