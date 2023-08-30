package Recursion;

public class Friends_Pairing {

    /*
    Question

   Given n friends, each one can remain single or can be paired up with some friends. Each friend can be paired only one.
   Find out the total number of ways inn which friends can remain single or can pair up.
     */

    public static int friendsPairing(int n){

        //Base Case
        if(n==1 || n==2){
            return n;
        }

        //Single
        int single = friendsPairing(n-1);

        //Pair
        int pair = friendsPairing(n-2);
        int pairWays = (n-1) * pair;

        //Total ways
        int totalWays = single + pairWays;

        return totalWays;

        /*
        OR

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

         */


    }
    public static void main(String[] args) {

        System.out.println(friendsPairing(6));
    }
}
