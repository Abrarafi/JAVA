import javax.swing.JFrame;

public class ExtendsFromJframe extends JFrame {

    public ExtendsFromJframe() {
        // Set the title of the frame.
        setTitle("Empty Frame");

        // Set the size of the frame.
        setSize(400, 300);

        // Set the default close operation to exit the application.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible.
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the ExtendsFromJframe class.
        new ExtendsFromJframe();
    }
}
