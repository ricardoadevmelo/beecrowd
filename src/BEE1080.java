import java.util.Scanner;

public class BEE1080 {
    public static void main(String[] args) {

        // Major and Position

        Scanner sc = new Scanner(System.in);

        int maior = sc.nextInt();
        int posicao = 1;

        for (int i = 2; i <= 100; i++) {

            int x = sc.nextInt();

            if (x > maior) {
                maior = x;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}