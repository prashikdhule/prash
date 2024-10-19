package oct.ex_02102024;

import java.util.Scanner;

public class Lab0013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number (1 to 7 )");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("it's Monday");
                break;
            case 2 :
                System.out.println("it's Tuesday");
                break;
            case 3 :
                System.out.println("it's Wedensday");
                break;
            case 4 :
                System.out.println("it's Thrusday");
                break;
            case 5 :
                System.out.println("it's Friday");
                break;
            case 6 :
                System.out.println("it's Saterday");
                break;
            case 7 :
                System.out.println("it's Sunday ");
                break;
            default:
                System.out.println("No idea , which day its");

        }




    }
}
