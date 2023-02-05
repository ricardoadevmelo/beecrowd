import java.util.Scanner;

public class BEE1159 {
    public static void main(String[] args) {

        // Sum of Consecutive Pairs

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {

            if (x % 2 == 0) {
                int somaPar = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(somaPar);
            } else {
                int y = 1;
                int z = x + y;
                int somaImpar = z + (z + 2) + (z + 4) + (z + 6) + (z + 8);
                System.out.println(somaImpar);
            }

            x = sc.nextInt();
        }

        sc.close();
    }
}