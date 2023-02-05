import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) {

        // Age in Days

        Scanner sc = new Scanner(System.in);

        int age, day, month, year, restMonth, restYear;

        age = sc.nextInt();

        year = age / 365;
        restYear = age % 365;

        month = restYear / 30;
        restMonth = restYear % 30;

        day = restMonth;

        System.out.printf("%d ano(s)\n" +
                        "%d mes(es)\n" +
                        "%d dia(s)\n",
                year, month, day);

        sc.close();
    }
}