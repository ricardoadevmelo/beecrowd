import java.util.Locale;
import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {

        // Game Time with Minutes

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horIni, horFin, minIni, minFin, inicioJogo, finalJogo, duracao, horas, minutos;

        horIni = sc.nextInt();
        minIni = sc.nextInt();
        horFin = sc.nextInt();
        minFin = sc.nextInt();

        inicioJogo = horIni * 60 + minIni;
        finalJogo = horFin * 60 + minFin;

        if (inicioJogo < finalJogo) {
            duracao = finalJogo - inicioJogo;
        } else {
            duracao = (24 * 60 - inicioJogo) + finalJogo;
        }

        horas = duracao / 60;
        minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");


        sc.close();
    }
}