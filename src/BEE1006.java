import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {

        // Average 2

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, average;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        average = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f%n", average);

        sc.close();
    }
}