import java.util.Locale;
import java.util.Scanner;

public class BEE1040 {
    public static void main(String[] args) {

        // Average 3

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, n4, media, exame;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1 * 2f) + (n2 * 3f) + (n3 * 4f) + (n4)) / (10f);
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7f) {
            System.out.println("Aluno aprovado.");

        } else if (media < 5f) {
            System.out.println("Aluno reprovado.");

        } else {
            System.out.println("Aluno em exame.");
            exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            float notaExame = (exame + media) / 2f;
            if (notaExame >= 5f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + notaExame);
        }

        sc.close();
    }
}