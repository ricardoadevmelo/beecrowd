import java.util.Locale;
import java.util.Scanner;

public class BEE1079 {
    public static void main(String[] args) {

        // Weighted Averages

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double notaX = sc.nextDouble();
            double notaY = sc.nextDouble();
            double notaZ = sc.nextDouble();

            double mediaPonderada = ((2.0 * notaX) + (3.0 * notaY) + (5.0 * notaZ)) / (2.0 + 3.0 + 5.0);
            System.out.printf("%.1f%n", mediaPonderada);

        }

        sc.close();
    }
}