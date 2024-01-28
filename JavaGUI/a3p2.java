import javax.swing.*;
public class a3p2 {
    JFrame mframe,frame1;
    a3p2()
    {
        JFrame mframe=new JFrame("click to close everything", null);
        JFrame frame1=new JFrame("click to close only this ", null);
        mframe.setSize(500, 500);
        frame1.setSize(300,300);
        mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mframe.setVisible(true);
        frame1.setVisible(true);
    }
    public static void main(String args[])
    {
        new a3p2();
    }
}
