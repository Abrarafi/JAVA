import java.awt.Frame;
import java.awt.event.*;

public class CreatingTwoFrameUsingFrame {
    public static void main(String[] args) {
            createMasterFrame();
            createTemporaryFrame();
    }

    public static void createMasterFrame() {
        Frame masterFrame = new Frame("Master Frame");
        masterFrame.setSize(450, 450);

        masterFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close everything when master frame is closed
            }
        });

        masterFrame.setVisible(true);
    }

    public static void createTemporaryFrame() {
        Frame tempFrame = new Frame("Temporary Frame");
        tempFrame.setSize(300, 300);

        tempFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                tempFrame.dispose(); // Close only the temporary frame
            }
        });

        tempFrame.setVisible(true);
    }
}