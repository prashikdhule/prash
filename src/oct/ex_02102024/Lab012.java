package oct.ex_02102024;

import java.util.Scanner;

public class Lab012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the score ");
        int score = scanner.nextInt();
        char grade = 'f';

        if (score >=90 && score <=100){
            System.out.println("your grade is A");
            } else if (score >=80 && score <=89) {
            System.out.println("your grade is B");
        } else if (score >=70 && score <=79) {
            System.out.println("your grade ic C");
        } else if (score >=60 && score <=69) {
            System.out.println("your grade is D");
        } else if (score <= 0 || score >100) {
            System.out.println("wrong Score please enter valid number");
        } else {
            System.out.println("you are fail");
        }


        }

    }

