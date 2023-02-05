import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {

        // Sum of Consecutive Odd Numbers I

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int menor, maior;
        if (x > y) {
            menor = y;
            maior = x;
        } else {
            menor = x;
            maior = y;
        }

        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}