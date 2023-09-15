package Recursion.Question;

/*
    Q. Program to find a Length of a String using Recursion.

    Example.
        Input - apple
        Output - 5
 */

public class Third {

    public static int countStringLength(String string){

        //Base Case
        if(string.length() == 0){
            return 0;
        }
        return countStringLength(string.substring(1)) + 1;
    }

    public static void main(String[] args) {

        String string = "HelloABC";

        System.out.println(countStringLength(string));

    }
}
