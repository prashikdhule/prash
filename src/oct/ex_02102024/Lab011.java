package oct.ex_02102024;

import java.util.Scanner;

public class Lab011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter first number");
        int no1 = scanner.nextInt();
        System.out.println("enter second number");
        int no2 = scanner.nextInt();
        if (no1 > no2 ){
            System.out.println("number 1 is grater then number 2");
        }else if (no1 < no2)
        {
            System.out.println("number 1 is less then number 2");
        }
        else {
            System.out.println("equal numer");
        }


    }

}
