package oct.ex_02102024;

import java.util.Scanner;

public class Lab15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int month = scanner.nextInt();
        switch(month){
            case 1:
            System.out.println ("it's January");
            break;
            case 2:
                System.out.println ("it's February");
                break;
            case 3:
                System.out.println ("it's March");
                break;
            case 4:
                System.out.println ("it's April");
                break;
            case 5:
                System.out.println ("it's May");
                break;
            case 6:
                System.out.println ("it's June");
                break;
            case 7:
                System.out.println ("it's July");
                break;
            case 8:
                System.out.println ("it's August");
                break;
            case 9:
                System.out.println ("it's September");
                break;
            case 10:
                System.out.println ("it's October");
                break;
            case 11:
                System.out.println ("it's November");
                break;
            case 12:
                System.out.println ("it's December");
                break;
            default:
                System.out.println("enter the valid no");


        }

    }
}
