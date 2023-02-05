import java.util.Scanner;

public class BEE1143 {
    public static void main(String[] args) {

        // Square and Cube

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 1 && n < 1000) {

            for (int i = 1; i <= n; i++) {
                int resultado2 = i * i;
                int resultado3 = resultado2 * i;
                System.out.printf("%d %d %d%n", i, resultado2, resultado3);
            }

        }

        sc.close();
    }
}