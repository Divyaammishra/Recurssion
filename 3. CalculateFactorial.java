package Recursion;

import java.util.Scanner;

public class C_Factorial {

    public static int factorial(int number) {

        //Base case
        if (number == 0) {
            return 1;
        }
        int factorialOfNumberMinus1 = factorial(number - 1);
        int factorialOfNumber = number * factorial(number - 1);
        return factorialOfNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any positive number only : ");
        int number  = scanner.nextInt();

        //Calling function
        System.out.println(factorial(number));



    }
}
