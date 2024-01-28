
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator2 implements ActionListener{

    static JFrame frame;
    static JTextField num1;
    static JTextField num2,ans;
    static JButton add,sub,mul,div;
    static JPanel p1,p2,p3;

    String s0,s1,s2;
    calculator2()
    {
        s1="";
    }

    public static void main (String[] args){
        frame=new JFrame("Calculator");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,300,300);
        frame.setLayout(new GridLayout(3,1));
        
        num1=new JTextField(10);
        num1.setBounds(400,200,100,30);
          
        num2=new JTextField(10);
        num2.setBounds(400,200,100,30);
        
         add=new JButton("+");
        add.setBounds(400,200,100,30); 
        
        sub=new JButton("-");
        sub.setBounds(400,200,100,30); 
        
        mul=new JButton("*");
        mul.setBounds(400,200,100,30); 
        
        div=new JButton("/");
        div.setBounds(400,200,100,30); 
        
        ans=new JTextField(20);
        ans.setBounds(400,200,100,30); 
        ans.setEditable(false);
        
        p1=new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(num1);
        p1.add(num2);
        
        p2=new JPanel();
        p2.add(add);
        p2.add(sub);
        p2.add(mul);
        p2.add(div);
        
        p3=new JPanel();
        p3.add(ans);
        
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.setVisible(true);
        
        calculator2 c=new calculator2();

        add.addActionListener(c);
        sub.addActionListener(c);
        mul.addActionListener(c);
        div.addActionListener(c);

        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        s0=num1.getText();
        s2=num2.getText();
        s1=e.getActionCommand();
        double n1=Double.parseDouble(s0);
        double n2=Double.parseDouble(s2);
        String str="";
        if(s1=="+")
        {
            str=String.format("%.2f", n1+n2);
        }
        else if(s1=="-")str=String.format("%.2f", n1-n2);
        else if(s1=="/")str=String.format("%.2f", n1/n2);
        else if(s1=="*")str=String.format("%.2f", n1*n2);
        
        ans.setText(s0+s1+s2+" = "+str);

    }
}

