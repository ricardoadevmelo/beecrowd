import java.util.Scanner;

public class BEE1074 {
    public static void main(String[] args) {

        // Even or odd

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 10000) {

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (x == 0) {
                    System.out.println("NULL");
                } else if (x % 2 == 0 && x < 0) {
                    System.out.println("EVEN NEGATIVE");
                } else if (x % 2 == 0 && x > 0) {
                    System.out.println("EVEN POSITIVE");
                } else if (x % 2 != 0 && x > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }

            }

        }

        sc.close();
    }
}