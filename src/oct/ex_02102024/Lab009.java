import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("you allowed to vote");
        } else {
            System.out.println("You are not allowed to vote");
        }

    }

}
