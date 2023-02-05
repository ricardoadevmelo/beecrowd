import java.util.Scanner;

public class BEE1144 {
    public static void main(String[] args) {

        // Logical Sequence

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 1 && n < 1000) {

            for (int i = 1; i <= n; i++) {

                int segundo = i * i;
                int terceiro = i * i * i;
                System.out.printf("%d %d %d%n", i, segundo, terceiro);
                System.out.printf("%d %d %d%n", i, segundo + 1, terceiro + 1);
            }

        }

        sc.close();
    }
}