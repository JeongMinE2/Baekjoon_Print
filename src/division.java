import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        int result1 = (A * B)%C;
        System.out.println(result1);
        int result2 = ((A%C)*(B%C))%C;
        System.out.println(result2);
    }
}
