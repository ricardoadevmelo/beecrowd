import java.util.Locale;
import java.util.Scanner;

public class BEE1050 {
    public static void main(String[] args) {

        // DDD

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int DDD = sc.nextInt();

        int brasilia = 61;
        int salvador = 71;
        int saoPaulo = 11;
        int rioDeJaneiro = 21;
        int juizDeFora = 32;
        int campinas = 19;
        int vitoria = 27;
        int beloHorizonte = 31;

        if (DDD == brasilia) {
            System.out.println("Brasilia");
        } else if (DDD == salvador) {
            System.out.println("Salvador");
        } else if (DDD == saoPaulo) {
            System.out.println("Sao Paulo");
        } else if (DDD == rioDeJaneiro) {
            System.out.println("Rio de Janeiro");
        } else if (DDD == juizDeFora) {
            System.out.println("Juiz de Fora");
        } else if (DDD == campinas) {
            System.out.println("Campinas");
        } else if (DDD == vitoria) {
            System.out.println("Vitoria");
        } else if (DDD == beloHorizonte) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }

        sc.close();

    }
}