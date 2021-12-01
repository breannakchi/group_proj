package learnSwing.tut1;

public class Main {

    public static void main(String[] args) {

        //First way to make a frame
/*
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("Frame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        frame.setResizable(false); //prevents the user from resizing the frame
        frame.setSize(420,420);//sets the x and y dimension of the frame
        frame.setVisible(true);//makes the frame visible

        ImageIcon image = new ImageIcon("frameIcon.png");//create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(0, 0, 0));//change background color of the frame
*/
        //Second way to make a frame
        MyFrame frame  = new MyFrame();
    }



}
