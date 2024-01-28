package GUI;

import java.awt.BorderLayout;

import javax.swing.*;

public class testerror{
	public static void main(String [] args) {
		JFrame frame = new JFrame("Border Layout");
		
		JButton button1 = new JButton("North");
		JButton button2 = new JButton("West");
		JButton button3 = new JButton("East");
		JButton button4 = new JButton("South");
		JButton button5 = new JButton("Center");
		
		
		frame.add(button1,BorderLayout.NORTH);
		frame.add(button2,BorderLayout.WEST);
		frame.add(button3,BorderLayout.EAST);
		frame.add(button4,BorderLayout.SOUTH);
		frame.add(button5,BorderLayout.CENTER);
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
	
	
}