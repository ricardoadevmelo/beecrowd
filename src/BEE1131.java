import java.util.Locale;
import java.util.Scanner;

public class BEE1131 {
    public static void main(String[] args) {

        // Grenals

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int vitInter = 0;
        int vitGremio = 0;
        int contGrenal = 0;
        int empate = 0;
        int novoGrenal = 1;
        while (novoGrenal == 1) {
            contGrenal++;
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();
            if (golsInter > golsGremio) {
                vitInter++;
            } else if (golsGremio > golsInter) {
                vitGremio++;
            } else {
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
        }
        System.out.println(contGrenal + " grenais");
        System.out.println("Inter:" + vitInter);
        System.out.println("Gremio:" + vitGremio);
        System.out.println("Empates:" + empate);

        if (vitInter > vitGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitInter < vitGremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}