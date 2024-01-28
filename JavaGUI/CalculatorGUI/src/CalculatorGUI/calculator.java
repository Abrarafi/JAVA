package CalculatorGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator extends JFrame implements ActionListener {
	
	static JFrame frame;
	static JTextField l;
	
	String s0,s1,s2;
	calculator()
	{
		s0=s1=s2="";
	}
	
	public static void main(String args[])
	{
		calculator c=new calculator();
		try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
		
		frame =new JFrame("calculator");
		frame.setSize(400,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(2,1));
		
		l=new JTextField();
		l.setPreferredSize(new Dimension(350,80));
		l.setEditable(false);
		
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,beq,bc,be;
		
		b0=new JButton("0"); b1=new JButton("1"); b2=new JButton("2"); b3=new JButton("3");
		b4=new JButton("4"); b5=new JButton("5"); b6=new JButton("6"); b7=new JButton("7");
		b8=new JButton("8"); b9=new JButton("9"); ba=new JButton("+"); bs=new JButton("-");
		bm=new JButton("*");
		bd=new JButton("/"); beq=new JButton("="); bc=new JButton("C"); be=new JButton(".");
		
		
		b0.addActionListener(c); b1.addActionListener(c);
		b2.addActionListener(c); b3.addActionListener(c);
		b4.addActionListener(c); b5.addActionListener(c);
		b6.addActionListener(c); b7.addActionListener(c);
		b8.addActionListener(c); b9.addActionListener(c);
		ba.addActionListener(c); bs.addActionListener(c);
		bm.addActionListener(c); bd.addActionListener(c);
		beq.addActionListener(c); bc.addActionListener(c);
		be.addActionListener(c);
		
		ImageIcon iconC=new ImageIcon("C:/Users/Abrar/Downloads/icons8-c-key-50.png");
		//bc.setIcon(iconC);
		JPanel p=new JPanel(new GridLayout(5,4));
		JPanel p1=new JPanel();
		p1.add(l);
		
		p.add(ba); p.add(b1); p.add(b2); p.add(b3);
		
		p.add(bs);p.add(b4);p.add(b5); p.add(b6); 
		
		p.add(bm);p.add(b7);p.add(b8); p.add(b9);  
		
		 p.add(bd);p.add(beq);  p.add(b0);p.add(be);
		
		 p.add(bc);
		
		p.setBackground(Color.gray);
		p1.setBackground(Color.gray);
		
		frame.add(p1);
		frame.add(p);
		
		frame.show();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try
		{
			
		
		String s = e.getActionCommand();
		
		if((s.charAt(0)>='0' && s.charAt(0)<='9') || s.charAt(0)=='.')
		{
			if(!s1.equals(""))
			{
				s2=s2+s;
			}
			else s0=s0+s;
			l.setText(s0+s1+s2);
		}
		else if(s.charAt(0)=='=')
		{
			double eq = 0;
			
			if(s1.equals("+")) eq= (Double.parseDouble(s0)+Double.parseDouble(s2));
			else if(s1.equals("-")) eq = (Double.parseDouble(s0)- Double.parseDouble(s2));
			else if(s1.equals("/")) eq = (Double.parseDouble(s0)/ Double.parseDouble(s2));
			else if(s1.equals("*")) eq = (Double.parseDouble(s0) * Double.parseDouble(s2));
			
			l.setText(s0+s1+s2+ " = "+eq);
			
			s0=Double.toString(eq);
			s1=s2="";
		}
		else if(s.charAt(0)=='C')
		{
			s0=s1=s2="";
			l.setText(s0+s1+s2);
		}
		else
		{
			if(s1.equals("") || s2.equals(""))
			{
				s1=s;
			}
			else
			{
				double eq=0;
				if(s1.equals("+"))eq=(Double.parseDouble(s0)+Double.parseDouble(s2));
				else if(s1.equals("-"))eq=(Double.parseDouble(s0)-Double.parseDouble(s2));
				else if(s1.equals("/"))
				{
					if(s2=="0")
					{
						throw new ArithmeticException("Can't Devide by 0");
					}
					eq=(Double.parseDouble(s0)/ Double.parseDouble(s2));
				}
				else if(s1.equals("*"))eq=(Double.parseDouble(s0)*Double.parseDouble(s2));
				
				s0=Double.toString(eq);
				
				s1=s;
				s2="";
			}
			l.setText(s0+s1+s2);
		}
		
	}
		catch(Exception e1)
		{
			System.out.println("An error occurred: " + e1.getMessage());
		}
		
	}
}
