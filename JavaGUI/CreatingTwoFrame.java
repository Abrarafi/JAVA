import javax.swing.*;

public class CreatingTwoFrame {
    public static void main(String[] args) {
        createMasterFrame();
        createTemporaryFrame();
    }

    public static void createMasterFrame() {
        JFrame masterFrame = new JFrame("Master Frame");
        masterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        masterFrame.setSize(450, 450);
        masterFrame.setVisible(true);
    }

    public static void createTemporaryFrame() {
        JFrame tempFrame = new JFrame("Temporary Frame");
        tempFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //Not Mendatory
        tempFrame.setSize(300, 300);
        tempFrame.setVisible(true);
    }
}