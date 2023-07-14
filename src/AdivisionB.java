import java.util.Scanner;

public class AdivisionB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double result = x / y;

        System.out.printf("%.10f%n", result);
        System.out.printf("%.10f", x / y);
        sc.close();
    }
}
