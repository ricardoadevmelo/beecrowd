import java.util.Locale;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {

        // Ball

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        double pi = 3.14159;
        double volume = (4/3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}