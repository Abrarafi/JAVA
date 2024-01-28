import javax.swing.*;
public class a3p1b {
    a3p1b()
    {
        JFrame frame1=new JFrame("MY first java GUI", null) ;
        frame1.setSize(500,500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
    public static void main(String args[])
    {
        new a3p1b();
    }
}
