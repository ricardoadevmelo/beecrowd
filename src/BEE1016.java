import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {

        // Distance

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int tempo = range * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}