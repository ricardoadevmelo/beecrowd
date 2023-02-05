import java.util.Locale;
import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {

        // Fuel Expenditure

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int speed = sc.nextInt();

        double liter = time * speed / 12.0;

        System.out.printf("%.3f%n", liter);

        sc.close();
    }
}