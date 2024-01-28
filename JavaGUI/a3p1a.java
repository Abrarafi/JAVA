import javax.swing.*; 
import java.sql.*; 
public class a3p1a {  
    JFrame frame;
    a3p1a()
    {
        frame=new JFrame("My first java GUI frame", null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
       new a3p1a();
    }
}  