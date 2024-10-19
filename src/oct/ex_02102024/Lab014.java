package oct.ex_02102024;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();
        System.out.println("choise option");
        int calculator = scanner.nextInt();


        switch (calculator) {
            case 1 :
                //int sum = num1+num2;
                System.out.println("Addition of this no is : " + (num1 + num2));
                break;
            case 2:
                //int differnece = num1-num2;
                System.out.println("substraction of this no is : " + (num1 - num2));
                break;
            case 3:
                //int Multiplication = num1*num2;
                System.out.println("Multiplication of the 2 numbers : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Subtraction of the 2 numbers : " + (num1 / num2));
                //int Division = num1/num2;
                break;
            default:
                System.out.println("nothing");



        }
    }
}
