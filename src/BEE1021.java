import java.util.Locale;
import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {

        // Notes and Coins

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num;
        int quotient, rest, note, coin;

        num = sc.nextDouble();

        rest = (int) (num * 100.0 + 0.5);

        System.out.println("NOTAS:");

        note = 100;
        quotient = rest / (note * 100);
        System.out.println(quotient + " nota(s) de R$ " + note + ".00");
        rest = rest % (note * 100);

        note = 50;
        quotient = rest / (note * 100);
        System.out.println(quotient + " nota(s) de R$ " + note + ".00");
        rest = rest % (note * 100);

        note = 20;
        quotient = rest / (note * 100);
        System.out.println(quotient + " nota(s) de R$ " + note + ".00");
        rest = rest % (note * 100);

        note = 10;
        quotient = rest / (note * 100);
        System.out.println(quotient + " nota(s) de R$ " + note + ".00");
        rest = rest % (note * 100);

        note = 5;
        quotient = rest / (note * 100);
        System.out.println(quotient + " nota(s) de R$ " + note + ".00");
        rest = rest % (note * 100);

        note = 2;
        quotient = rest / (note * 100);
        System.out.println(quotient + " nota(s) de R$ " + note + ".00");
        rest = rest % (note * 100);

        System.out.println("MOEDAS:");

        coin = 100;
        quotient = rest / coin;
        System.out.println(quotient + " moeda(s) de R$ 1.00");
        rest = rest % coin;

        coin = 50;
        quotient = rest / coin;
        System.out.println(quotient + " moeda(s) de R$ 0.50");
        rest = rest % coin;

        coin = 25;
        quotient = rest / coin;
        System.out.println(quotient + " moeda(s) de R$ 0.25");
        rest = rest % coin;

        coin = 10;
        quotient = rest / coin;
        System.out.println(quotient + " moeda(s) de R$ 0.10");
        rest = rest % coin;

        coin = 5;
        quotient = rest / coin;
        System.out.println(quotient + " moeda(s) de R$ 0.05");
        rest = rest % coin;

        System.out.println(rest + " moeda(s) de R$ 0.01");

        sc.close();
    }
}