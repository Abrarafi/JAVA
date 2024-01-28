import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RadioCheckBox {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio/Combo Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create two panels
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Radio Buttons", TitledBorder.LEFT, TitledBorder.TOP));
        // TitledBorder.LEFT, TitledBorder.TOP is not mendatory
        panel1.setLayout(new GridLayout(2, 1));
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Check Boxes", TitledBorder.LEFT, TitledBorder.TOP));
        panel2.setLayout(new GridLayout(3,1));

        // Create radio buttons
        JRadioButton radioButton1 = new JRadioButton("4 Slices");
        JRadioButton radioButton2 = new JRadioButton("8 Slices");

        // Create a button group for radio buttons
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);

        // Create a combo box
        String[] comboBoxItems = {"Cow", "Bird", "Cat", "Dog", "Rabbit"};
        JComboBox<String> comboBox = new JComboBox<>(comboBoxItems);

        // Create check boxes
        JCheckBox checkBox1 = new JCheckBox("Anchovies");
        JCheckBox checkBox2 = new JCheckBox("Garlic");

        // Add components to panels
        panel1.add(radioButton1);
        panel1.add(radioButton2);
        
        panel2.add(checkBox1);
        panel2.add(checkBox2);
        panel2.add(comboBox);

        frame.add(panel1,BorderLayout.WEST);
        frame.add(panel2,BorderLayout.EAST);

        frame.setVisible(true);
    }
}
