import java.util.Locale;
import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {

        // Snack

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, quant;
        double total;

        cod = sc.nextInt();
        quant = sc.nextInt();

        if (cod == 1) {
            total = quant * 4.00;
        } else if (cod == 2) {
            total = quant * 4.50;
        } else if (cod == 3) {
            total = quant * 5.00;
        } else if (cod == 4) {
            total = quant * 2.00;
        } else {
            total = quant * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}