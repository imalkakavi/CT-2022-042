import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length() - 1));
    }
}