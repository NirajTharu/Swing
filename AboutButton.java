import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutButton extends JFrame implements ActionListener {
    JButton button =  new JButton();
    JLabel label;
    AboutButton()
    {
        ImageIcon icon = new ImageIcon("ProfilePic.png");
        ImageIcon icon1 = new ImageIcon("ProfilePic.png");

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150, 250,150, 250);
        label.setVisible(false );
        
        button = new JButton();
        button.setBounds(50, 150, 250, 250);
        button.addActionListener(this);
        button.setText("This is OK Button");
        button.setBackground(Color.BLACK);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,24));
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,400);
        this.add(button);
        this.setVisible(true);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            System.out.println("Hi there");
            // To make the button clickable only once
            // button.setEnabled(false);
            label.setVisible(true); 
        }
    }
}

