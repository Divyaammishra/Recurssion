package Recursion;

/*
   Q. Print all binary string of size n without consecutive ones

   Example
   01010 -> Valid
   0010 -> Valid
   1101 -> Not Valid

 */
public class M_BinaryString {

    public static void printBinaryString(int n, int lastPlace, String string){

        //BaseCase
        if(n == 0){
            System.out.println(string);
            return;
        }

        //Code

        printBinaryString(n-1, 0, string+"0");
        if(lastPlace == 0){
            printBinaryString(n-1, 1, string+"1");
        }
   }

    public static void main(String[] args) {

        printBinaryString(4, 1, "");
    }
}
