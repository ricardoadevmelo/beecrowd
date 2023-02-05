import java.util.Locale;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {

        // Consumption

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        double consumption = sc.nextDouble();

        double conMed = distance / consumption;

        System.out.printf("%.3f km/l%n", conMed);

        sc.close();
    }
}