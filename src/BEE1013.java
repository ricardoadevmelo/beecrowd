import java.util.Locale;
import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) {

        // The biggest

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ab = (a + b + Math.abs(a - b)) / 2;
        int abc = (ab + c + Math.abs(ab - c)) / 2;

        System.out.println(abc + " eh o maior");

        sc.close();
    }
}