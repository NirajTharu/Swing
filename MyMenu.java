import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu FileMenu;
    JMenu EditMenu;
    JMenu HelpMenu;
    JMenuItem loadItem;
    JMenuItem SaveItem;
    JMenuItem SaveAsItem;
    JMenuItem RenameItem;
    
    MyMenu()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        FileMenu = new JMenu("File");
        EditMenu = new JMenu("Edit");
        HelpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        SaveItem = new JMenuItem("Save");
        SaveAsItem = new JMenuItem("SaveAs");
        RenameItem = new JMenuItem("Rename");

        loadItem.addActionListener(this);
        SaveItem.addActionListener(this);
        SaveAsItem.addActionListener(this);
        RenameItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);// L for load
        SaveItem.setMnemonic(KeyEvent.VK_S);// L for save
        RenameItem.setMnemonic(KeyEvent.VK_R);// R for Rename


        FileMenu.add(loadItem);
        FileMenu.add(SaveItem);
        FileMenu.add(SaveAsItem);
        FileMenu.add(RenameItem);
         
        menuBar.add(FileMenu);
        menuBar.add(EditMenu);
        menuBar.add(HelpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == loadItem)
        {
            System.out.println("You have Load the file");
        }
        else if(e.getSource() == SaveItem)
        {
            System.out.println("You have save the file.");
        }
        else if(e.getSource() == SaveAsItem)
        {
            System.out.println("You have saveas the file.");
        }
        else if(e.getSource() == RenameItem)
        {
            System.out.println("You have rename the file.");
        }
    }
    
}
