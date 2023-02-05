import java.util.Locale;
import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {

        // Types of Triangles

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double lado1, lado2, lado3, A, B, C;

        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();

        if (lado1 > lado2 && lado1 > lado3) {
            A = lado1;
            if (lado2 > lado3) {
                B = lado2;
                C = lado3;
            } else {
                B = lado3;
                C = lado2;
            }
        } else if (lado2 > lado3) {
            A = lado2;
            if (lado1 > lado3) {
                B = lado1;
                C = lado3;
            } else {
                B = lado3;
                C = lado1;
            }
        } else {
            A = lado3;
            if (lado1 > lado2) {
                B = lado1;
                C = lado2;
            } else {
                B = lado2;
                C = lado1;
            }
        }
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}