import java.util.Locale;
import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {

        // Triangle

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pTriangulo, aTrapezio, A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if ((A + B) > C && (A + C) > B && (B + C) > A) {
            pTriangulo = A + B + C;
            System.out.printf("Perimetro = %.1f%n", pTriangulo);
        } else {
            aTrapezio = (A + B) * C / 2.0;
            System.out.printf("Area = %.1f%n", aTrapezio);
        }

        sc.close();
    }
}