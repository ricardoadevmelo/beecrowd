import java.util.Locale;
import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {

        // Animal

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String animal1, animal2, animal3;

        animal1 = sc.nextLine();
        animal2 = sc.nextLine();
        animal3 = sc.nextLine();

        if (animal1.equals("vertebrado")) {
            if (animal2.equals("ave")) {
                if (animal3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (animal3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (animal2.equals("inseto")) {
                if (animal3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (animal3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}