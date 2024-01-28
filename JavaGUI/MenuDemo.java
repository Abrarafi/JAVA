import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextArea textArea = new JTextArea();       // For Displaying Somethings on the Frame
        textArea.setEditable(false);

        // Create a MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a Menu
        JMenu menu = new JMenu("File");

        // Create MenuItems
        JMenuItem menuItem1 = new JMenuItem("Open");
        JMenuItem menuItem2 = new JMenuItem("Save");
        JMenuItem menuItem3 = new JMenuItem("Exit");

        // Add ActionListeners to the MenuItems
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open MenuItem clicked");
                textArea.append("Open MenuItem clicked\n");     // For Displaying on the Frame
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save MenuItem clicked");
                textArea.append("Save MenuItem clicked\n");     // For Displaying on the Frame
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit MenuItem clicked");
                textArea.append("Exit MenuItem clicked\n");     // For Displaying on the Frame
                System.exit(0);
            }
        });

        // Add MenuItems to the Menu
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.addSeparator(); // Add a separator between Save and Exit
        menu.add(menuItem3);

        // Add the Menu to the MenuBar
        menuBar.add(menu);

        // Create a JScrollPane for the textArea
        JScrollPane scrollPane = new JScrollPane(textArea);     // Used For Displaying Somethings on the Frame

        // Add the scrollPane to the JFrame
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set the MenuBar for the JFrame
        frame.setJMenuBar(menuBar);

        // Display the JFrame
        frame.setVisible(true);
    }
}
