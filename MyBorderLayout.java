import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBorderLayout {
    /*
        Layout Manager: Defines the natural layout for components within a container.
        3 common Managers: 
        Border Layout: A border layout places components in five areas: North, south , East , west , center
        All extra space is placed in the center area.
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));

        JPanel panel0 = new JPanel();     
        JPanel panel1 = new JPanel();     
        JPanel panel2 = new JPanel();     
        JPanel panel3 = new JPanel();     
        JPanel panel4 = new JPanel();     
        
        panel0.setBackground(Color.RED);
        panel1.setBackground(Color.GREEN);
        panel2.setBackground(Color.YELLOW);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.CYAN);
        
        panel0.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));

        

    //------------------------ Sub Panels -----------------------------

        JPanel panel5 = new JPanel();     
        JPanel panel6 = new JPanel();     
        JPanel panel7 = new JPanel();     
        JPanel panel8 = new JPanel();     
        JPanel panel9 = new JPanel();     
        
        panel5.setBackground(Color.BLACK);
        panel6.setBackground(Color.DARK_GRAY);
        panel7.setBackground(Color.GRAY);
        panel8.setBackground(Color.LIGHT_GRAY);
        panel9.setBackground(Color.WHITE);
        
        panel4.setLayout(new BorderLayout(10,10));

        panel5.setPreferredSize(new Dimension(50,50));
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));

        panel4.add(panel5,BorderLayout.NORTH);
        panel4.add(panel6,BorderLayout.SOUTH);
        panel4.add(panel7,BorderLayout.WEST);
        panel4.add(panel8,BorderLayout.EAST);
        panel4.add(panel9,BorderLayout.CENTER);
// ------------------- Sub Pannel ----------------------------------

        frame.add(panel0, java.awt.BorderLayout.NORTH);
        frame.add(panel1, java.awt.BorderLayout.WEST);
        frame.add(panel2, java.awt.BorderLayout.SOUTH);
        frame.add(panel3, java.awt.BorderLayout.CENTER);
        frame.add(panel4, java.awt.BorderLayout.EAST);
        frame.setVisible(true);

    }
}
 
