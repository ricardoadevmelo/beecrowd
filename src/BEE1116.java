import java.util.Locale;
import java.util.Scanner;

public class BEE1116 {
    public static void main(String[] args) {

        // Dividing X by Y

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultDiv = (double) x / y;
                System.out.printf("%.1f%n", resultDiv);
            }

        }

        sc.close();
    }
}