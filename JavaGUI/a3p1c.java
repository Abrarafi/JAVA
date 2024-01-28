import javax.swing.*;
public class a3p1c extends JFrame {
    JFrame frame;
    a3p1c()
    {
        setTitle("GUI frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new a3p1c();
    }
}
