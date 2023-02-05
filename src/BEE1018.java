import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {

        // bank note

        Scanner sc = new Scanner(System.in);

        int value, note100, note50, note20, note10, note5, note2, note1, rest100, rest50, rest20, rest10, rest5, rest2;

        value = sc.nextInt();

        note100 = value / 100;
        rest100 = value % 100;

        note50 = rest100 / 50;
        rest50 = rest100 % 50;

        note20 = rest50 / 20;
        rest20 = rest50 % 20;

        note10 = rest20 / 10;
        rest10 = rest20 % 10;

        note5 = rest10 / 5;
        rest5 = rest10 % 5;

        note2 = rest5 / 2;
        rest2 = rest5 % 2;

        note1 = rest2 / 1;

        System.out.printf("%d\n" +
                        "%d nota(s) de R$ 100,00\n" +
                        "%d nota(s) de R$ 50,00\n" +
                        "%d nota(s) de R$ 20,00\n" +
                        "%d nota(s) de R$ 10,00\n" +
                        "%d nota(s) de R$ 5,00\n" +
                        "%d nota(s) de R$ 2,00\n" +
                        "%d nota(s) de R$ 1,00\n",
                value, note100, note50, note20, note10, note5, note2, note1);

        sc.close();
    }
}