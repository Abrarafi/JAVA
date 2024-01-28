import javax.swing.*;
import java.awt.*;


public class frame_layout {
    public static void main(String[] args) {
        JFrame fd = new JFrame("My frame(default)");
        JFrame ff = new JFrame("My frame(flow)");
        JFrame fb = new JFrame("My frame(border)");
        JFrame fg = new JFrame("My frame(grid)");


        //DEFAULT
        JLabel lb = new JLabel("Label");
        lb.setBounds(100, 10,75, 25);
        
        JTextField tf = new JTextField("Text");
        tf.setBounds(175, 10,200, 25);

        JButton bt = new JButton("Send");
        bt.setBounds(380, 5, 100, 35);

        fd.add(lb);
        fd.add(tf);
        fd.add(bt);
        fd.setSize(600, 500);
        fd.setLayout(null);

        //FLOW
        JLabel lb1 = new JLabel("Label");
        lb1.setPreferredSize(new Dimension(75,25));
        
        JTextField tf1 = new JTextField("Text");
        tf1.setPreferredSize(new Dimension(200,25));

        JButton bt1 = new JButton("Send");
        bt1.setPreferredSize(new Dimension(100,35));
        
        ff.setLayout(new FlowLayout());
        ff.add(lb1);
        ff.add(tf1);
        ff.add(bt1);
        ff.setSize(600, 500);

        
        //BORDER
        JLabel lb2 = new JLabel("Label");
        lb2.setPreferredSize(new Dimension(75,25));
        
        JTextField tf2 = new JTextField("Text");
        tf2.setPreferredSize(new Dimension(200,25));

        JButton bt2 = new JButton("Send");
        bt2.setPreferredSize(new Dimension(100,35));
        
        fb.setLayout(new BorderLayout());
        fb.add(lb2,BorderLayout.WEST);
        fb.add(tf2,BorderLayout.CENTER);
        fb.add(bt2,BorderLayout.EAST);
        fb.setSize(600, 500);

        //GRID
        JLabel lb3 = new JLabel("Label");
        //lb3.setPreferredSize(new Dimension(75,25));
        
        JTextField tf3 = new JTextField("Text");
        //tf3.setPreferredSize(new Dimension(200,25));

        JButton bt3 = new JButton("Send");
       // bt3.setPreferredSize(new Dimension(100,35));
        
        fg.setLayout(new GridLayout(2,2));
        fg.add(lb3);
        fg.add(tf3);
        fg.add(bt3);
        fg.setSize(600, 500);

        fd.setVisible(true);
        ff.setVisible(true);
        fb.setVisible(true);
        fg.setVisible(true);


    }
}