package Recursion;

public class I_XtoPowerN {

    public static int xToPowerN(int x, int n){

        //Base case
        if (n == 0){
            return 1;
        }

        //recursion function
        return x * xToPowerN(x, n-1);
    }

    public static void main(String[] args) {

        int x = 10, n = 5;

        //calling function
        System.out.println(xToPowerN(x,n));
    }
}
