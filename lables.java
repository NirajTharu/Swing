import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class lables {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("ProfilePic.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        // JLabel: a GUI display area for a string of text, an image or both
        JLabel label = new JLabel();
        label.setText("Have good day.");
        label.setIcon(image);
        // set text Left, Right, Center of the image icon
        label.setHorizontalTextPosition(JLabel.CENTER);
        // This will set the text to Top , Center , Bottom of image icon
        label.setVerticalTextPosition(JLabel.TOP);
        // This will set the text color
        label.setForeground(new Color(1,22,77));
        // To change the font and its size
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        // To set gap of the text from image -ve number will make it closer where as the positive number will make it far
        label.setIconTextGap(-22);
        // To set the background color 
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        // To set border
        label.setBorder(border); 
        // To center the text + image within the label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // To set the in one place x and y for horzontal and vertical repectively
        label.setBounds(10,10, 200,200);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        // frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        // pack() : This will resize the frame. To use this frame.setLayout()  should be commented.
        frame.pack();

    }
}
