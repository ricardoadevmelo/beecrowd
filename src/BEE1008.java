import java.util.Locale;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {

        // Salary

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberEmp = sc.nextInt();
        int workedHours = sc.nextInt();
        double valueHours = sc.nextDouble();

        double salary = workedHours * valueHours;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numberEmp, salary);

        sc.close();
    }
}