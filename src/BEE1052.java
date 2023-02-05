import java.util.Locale;
import java.util.Scanner;

public class BEE1052 {
    public static void main(String[] args) {

        // Month

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        int January = 1;
        int February = 2;
        int March = 3;
        int April = 4;
        int May = 5;
        int June = 6;
        int July = 7;
        int August = 8;
        int September = 9;
        int October = 10;
        int November = 11;
        int December = 12;

        if (month == January) {
            System.out.println("January");
        } else if (month == February) {
            System.out.println("February");
        } else if (month == March) {
            System.out.println("March");
        } else if (month == April) {
            System.out.println("April");
        } else if (month == May) {
            System.out.println("May");
        } else if (month == June) {
            System.out.println("June");
        } else if (month == July) {
            System.out.println("July");
        } else if (month == August) {
            System.out.println("August");
        } else if (month == September) {
            System.out.println("September");
        } else if (month == October) {
            System.out.println("October");
        } else if (month == November) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }

        sc.close();
    }
}