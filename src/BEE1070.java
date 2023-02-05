import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {

        // Six odd numbers

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int cont = 0;
        if (x > 0) {
            while (cont < 6) {
                if (x % 2 != 0) {
                    cont++;
                    System.out.println(x);
                }
                x++;
            }
        }

        sc.close();
    }
}