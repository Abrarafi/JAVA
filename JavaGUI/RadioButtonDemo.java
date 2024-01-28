import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the radio buttons
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        // Group the radio buttons together
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        // Create the combo box
        String[] items = {"Java", "Python", "C++", "JavaScript"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Create the check boxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        // Create the panels
        JPanel panel1 = new JPanel();
        panel1.add(r1);
        panel1.add(r2);
        panel1.add(comboBox);

        JPanel panel2 = new JPanel();
        panel2.add(checkBox1);
        panel2.add(checkBox2);
        panel2.add(checkBox3);

        // Add the panels to the frame
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
