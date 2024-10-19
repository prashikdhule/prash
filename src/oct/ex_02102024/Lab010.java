package oct.ex_02102024;

import java.util.Scanner;

public class Lab010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numer");
        int num = scanner.nextInt();
        if (num%2 == 0) {
            System.out.println("number is even");
        }
            else{
                System.out.println("number is odd");
            }
        }
    }

