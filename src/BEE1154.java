import java.util.Locale;
import java.util.Scanner;

public class BEE1154 {
    public static void main(String[] args) {

        // Ages

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double idade = sc.nextDouble();
        double soma = 0;
        double count = 0;

        while (idade > 0) {
            soma = soma + idade;
            count++;
            idade = sc.nextInt();
        }
        double media = soma / count;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}