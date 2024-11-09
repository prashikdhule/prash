package oct.ex_02102024;

import java.util.Scanner;

public class Prashik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }

    }
}
