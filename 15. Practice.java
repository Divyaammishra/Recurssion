package Recursion.Question;

/*
    Q. Given a number (eg -  3561), convert it into a String of english like “three five six one”.
    Use a recursive function to solve this problem.NOTE-The digits of the number will only be in the range 0-9 and the last digit of
    a number can’t be 0.

    Example.
    Input: 2351
    Output: “two three five one”
 */

public class Second {

    static String digits[] = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
    public static void integerToString(int number){

        //Base Case
        if(number == 0){
            return;
        }

        int lastDigit = number%10;
        integerToString(number/10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {

        integerToString(123);

    }
}
