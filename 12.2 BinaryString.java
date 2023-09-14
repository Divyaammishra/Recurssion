package Recursion;

/*
    Q. Print all binary string of size n without a consecutive zero

    Example.
    010 -> Valid
    110 -> Valid
    100 -> not Valid
 */

public class N_BinaryString {

    public static void printBinaryString(int n, int lastPlace, String string){

        //Base Case
        if(n == 0){
            System.out.println(string);
            return;
        }

        //Code

        printBinaryString(n-1, 1, string+"1");
        if(lastPlace == 1){
            printBinaryString(n-1, 0, string+"0");
        }
    }

    public static void main(String[] args) {

        printBinaryString(3, 1, "");
    }
}
