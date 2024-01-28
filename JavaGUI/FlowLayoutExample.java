
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150); // Set the frame size

        // Create three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add the buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Make the frame visible
        frame.setVisible(true);
    }
}
