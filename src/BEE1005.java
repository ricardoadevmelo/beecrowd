import java.util.Locale;
import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) {

        // Average 1

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double average = (A * 3.5 + B * 7.5) / 11.0;

        System.out.printf("MEDIA = %.5f%n", average);

        sc.close();
    }
}