import java.util.Scanner;

public class joonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);

        if(name == name) {
            System.out.println(name.toLowerCase() + "??!");
        } else {
            System.out.println(name.toLowerCase());
        }

    }
}
