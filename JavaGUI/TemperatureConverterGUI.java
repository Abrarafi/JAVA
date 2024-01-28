import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterGUI{

    public static void main(String[] args) {
        JFrame frame= new JFrame("Temperature Converter");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3,1));

        JPanel panel1= new JPanel();
        panel1.setLayout(new FlowLayout());

        JLabel fahrenheitLabel = new JLabel("Enter Fahrenheit:");
        JTextField fahrenheitTextField = new JTextField(10);
        panel1.add(fahrenheitLabel);
        panel1.add(fahrenheitTextField);

        JPanel panel2= new JPanel();
        panel2.setLayout(new FlowLayout());

        JLabel celsiusLabel = new JLabel("Celsius Result:");
        JTextField celsiusTextField = new JTextField(10);
        panel2.add(celsiusLabel);
        panel2.add(celsiusTextField);
        celsiusTextField.setEditable(false);

        JPanel panel3= new JPanel();
        panel3.setLayout(new FlowLayout());

        JButton convertButton = new JButton("Convert");
        panel3.add(convertButton);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                celsiusTextField.setText(String.format("%.2f", celsius));
            }
        });
    }
}
