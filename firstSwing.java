import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class firstSwing {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        // This helps to set the window name
        frame.setTitle("Hi there");
        // This will close the frame when you exit the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This will helps to resize the window
        frame.setResizable(false);
        // This helps to change the color of the window
        frame.getContentPane().setBackground(new Color(12,33,22));
        // This will help to set the size of the window
        frame.setSize(400,400);
        // This will help to change the icon of image
        ImageIcon image = new ImageIcon("ProfilePic.png");
        frame.setIconImage(image.getImage());
        // This will make the window visible
        frame.setVisible(true);
    }
}
