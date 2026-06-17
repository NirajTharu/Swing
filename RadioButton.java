import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener{
    // JRadio Button: One or more buttons in a grouping in which Only one is selectable in a group.
    JRadioButton favFood;
    JRadioButton favDrink;
    JRadioButton favDesert;
    RadioButton()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        favFood = new JRadioButton("Phophee");
        favDrink = new JRadioButton("Water");
        favDesert = new JRadioButton("Papaya"); 

        ButtonGroup group = new ButtonGroup();
        group.add(favFood);
        group.add(favDrink);
        group.add(favDesert);

        favFood.addActionListener(this);
        favDesert.addActionListener(this);
        favDrink.addActionListener(this);

        this.add(favFood);
        this.add(favDrink);
        this.add(favDesert);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == favFood)
        {
            System.out.println("You Like Phophee.");
        }
        else if(e.getSource() == favDrink)
        {
            System.out.println("Your Fav drink is Water.");
        }
        else if(e.getSource() == favDesert)
        {
            System.out.println("You like Papaya.");
        }
    }
   
}
