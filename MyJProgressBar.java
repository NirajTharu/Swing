import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyJProgressBar {
    
    JFrame frame;
    JProgressBar progressBar;
    MyJProgressBar()
    {
        frame = new JFrame();
        progressBar = new JProgressBar(0,500);
        progressBar.setValue(0);
        progressBar.setBounds(0,0,420,50);
        progressBar.setFont(new Font("MV Boli",Font.BOLD,25));
        progressBar.setForeground(Color.RED);
        progressBar.setBackground(Color.BLACK);
        progressBar.setStringPainted(true);

        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill()
    {
        int counter = 500;
        while (counter >= 0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter -= 1;
        } 
        progressBar.setString("Done!");
    }
}
