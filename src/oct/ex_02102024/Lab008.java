package oct.ex_02102024;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        if (age>18) {
            System.out.println("you allowed to vote");
        }

    }
}
