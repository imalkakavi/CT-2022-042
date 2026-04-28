import javax.swing.JFrame;

public class Q13 {

    public static void main(String[] args) {

        JFrame myWindow = new JFrame("UOK");

        myWindow.setSize(500, 250);
        myWindow.setVisible(true);

        try {
            Thread.sleep(3000); // wait 3 seconds
        } catch (Exception e) {
        }

        myWindow.setVisible(false);

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        myWindow.setVisible(true);
    }
}