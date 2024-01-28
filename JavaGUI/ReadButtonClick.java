import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReadButtonClick {
    private static int i = 0; // Declare i as a field of the class

    public static void main(String args[]) {
        JButton button = new JButton("Ok");
        JFrame frame = new JFrame("My Frame");
        JTextField textField = new JTextField(15);

        textField.setText("Hello Java Click " + i);
        frame.setTitle("My Frame");
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(textField);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    i++;
                    textField.setText("Hello Java Click " + i);
                }
            }
        });
    }
}
