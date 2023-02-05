import java.util.Scanner;

public class BEE1075 {
    public static void main(String[] args) {

        // Rest of the Division 2

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 0 && n < 10000) {
            int cont = 2;
            for (int i = 1; i <= 10000; i++) {
                if (i % n == 2) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}