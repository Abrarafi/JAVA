import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GridLayout Example with Button Sizes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150); // Set the frame size
        
        frame.setLayout(new GridLayout(1, 3));

        // Create three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add buttons to the button row panel
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Make the frame visible
        frame.setVisible(true);
    }
}
