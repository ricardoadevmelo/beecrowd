import java.util.Locale;
import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {

        // Simple Sort

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println(a);
            if (b < c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b < c) {
            System.out.println(b);
            if (a < c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);

        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}