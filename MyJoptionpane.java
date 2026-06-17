import javax.swing.JOptionPane;

public class MyJoptionpane {
    public static void main(String[] args) {
        // JOptionPane: pop up a standard dialogue box that prompts users for a value or informs them of something.

        JOptionPane.showMessageDialog(null, "The info is below: ","__",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Alram Clock ","Snooz",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Are You 18+ ?","Question?",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your battery is low ! ","Warning!",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "404 NOT found ","ERROR",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Are you Okay?","Status", JOptionPane.YES_NO_OPTION);

        JOptionPane.showInputDialog("Enter Your Name: ");

        String[] responses = {"NO, you're awsome", "Thank you", "blush*"};
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 1);
    }
}
 