import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        int w = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(w, h);
        frame.setVisible(true);
    }
}