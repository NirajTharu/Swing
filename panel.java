import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel {
    public static void main(String[] args) {
        ImageIcon imgae =new ImageIcon("ProfilePic.png");

        JLabel label = new JLabel();
        label.setText("This one is the greenlabel");
        label.setIcon(imgae);

        // JPanel: A GUI component that functions as a container to hold other components
        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.PINK);
        pinkPanel.setBounds(0,0,200,200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(205,0,200,200);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(410,0, 200, 200);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,205, 610, 200);

        JFrame frame  = new JFrame();
        frame.setLayout(null);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(pinkPanel);
        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);
    }
}
