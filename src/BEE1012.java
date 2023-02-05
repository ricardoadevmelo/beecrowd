import java.util.Locale;
import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {

        // Area

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A, B, C;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        double pi = 3.14159;

        double areaTriangle = A * C / 2.0;
        double areaCircle = pi * Math.pow(C, 2);
        double areaTrapeze = (A + B) * C / 2.0;
        double areaSquare = Math.pow(B, 2);
        double areaRetangle = A * B;

        System.out.printf(  "TRIANGULO: %.3f%n" +
                        "CIRCULO: %.3f%n" +
                        "TRAPEZIO: %.3f%n" +
                        "QUADRADO: %.3f%n" +
                        "RETANGULO: %.3f%n",
                areaTriangle, areaCircle, areaTrapeze, areaSquare, areaRetangle);

        sc.close();
    }
}