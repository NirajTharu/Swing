import javax.swing.JFrame;

public class firstSwing {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("Hi there");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
