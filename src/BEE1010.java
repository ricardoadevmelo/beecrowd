import java.util.Locale;
import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {

        // Simple Calculation

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double val1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double val2 = sc.nextDouble();

        double total = val1 * num1 + val2 * num2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}