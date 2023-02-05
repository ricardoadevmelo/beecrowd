import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {

        // Salary with Bonus

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();

        double total = salary + sales * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}