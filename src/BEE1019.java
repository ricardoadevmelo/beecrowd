import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {

        // Time Conversion

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int hour = N / 3600;
        int rest = N % 3600;

        int minute = rest / 60;
        int second = rest % 60;

        System.out.println(hour + ":" + minute + ":" + second);

        sc.close();
    }
}