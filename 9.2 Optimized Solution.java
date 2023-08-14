package Recursion;

/*

There is two case, while calculating x^n

case 1 -
If n is an even

e.g. 2^8
     we can split this in ( 2^8 ) = 2^8/2 * 2^8/2
     which is same as 2^8


Case 2 -
If n is an odd

e.g. 2^5
      we can split this in ( 2^5 ) = 2 * 2^5/2 * 2^5/2
      which is same as 2^5

 */

public class J_XtoPowerN2 {

    public static int xToPowerN(int x, int n){

        //Base case
        if( n == 0){
            return 1;
        }

        //Calling inner function, also work when n is even
        int halfOfPower = xToPowerN(x,n/2);
        int halfOfPowerSq = halfOfPower * halfOfPower;

        //When n is an odd
        if(n % 2 != 0){
            halfOfPowerSq = x * halfOfPowerSq;
        }

        return halfOfPowerSq;
    }

    public static void main(String[] args) {

        System.out.println(xToPowerN(2,8)); //for even
        System.out.println(xToPowerN(2,5)); //for odd

    }
}
