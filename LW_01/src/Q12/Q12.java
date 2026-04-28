import javax.swing.JFrame;

public class Q12 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Frame");

        // set size: width = 300, height = 200
        frame.setSize(300, 200);

        // set position: x = 100 (left-right), y = 50 (top-bottom)
        frame.setLocation(100, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}