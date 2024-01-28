import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeDisplay {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Change Program");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Red button
        JButton redButton = new JButton("Red");
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the background color of the frame to red
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        // Create Green button
        JButton greenButton = new JButton("Green");
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the background color of the frame to green
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(redButton);
        frame.add(greenButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
