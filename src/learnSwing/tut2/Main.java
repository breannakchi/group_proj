package learnSwing.tut2;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[]args){

        ImageIcon image = new ImageIcon("frameIcon.png");

        JLabel label = new JLabel(); //create a label
        label.setText("Lashmagig");//first way to set text for a label
        label.setIcon(image); //add an image to the label?
        label.setHorizontalTextPosition(JLabel.CENTER);//horizontal alignment
        label.setVerticalTextPosition(JLabel.BOTTOM);//vertical alignment

        label.setForeground(new Color(255, 118, 236));
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label.setIconTextGap(100);



        JFrame frame = new JFrame();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        //frame.add(label); Is it just me, or does adding the label at the end cause an error?
    }
}
