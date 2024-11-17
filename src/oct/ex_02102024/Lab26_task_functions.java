package oct.ex_02102024;

import java.util.Scanner;

public class Lab26_task_functions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();

        int result_sum = sum_of_two_numbers(a,b);
        System.out.println("sum is -> " + result_sum);

        int result_sub = sub_of_two_numbers(a,b);
        System.out.println("sub is -> " + result_sub);

        int result_mul = mul_of_two_numbers(a,b);
        System.out.println("mul is -> " + result_mul);

        int result_div = div_of_two_numbers(a,b);
        System.out.println("Div is -> " + result_div);

    }
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int sub_of_two_numbers(int a, int b){
        return a-b;
    }
    static int mul_of_two_numbers(int a, int b){
        return  a*b;
    }
    static int div_of_two_numbers(int a,int b){
        return a/b;
    }
}
