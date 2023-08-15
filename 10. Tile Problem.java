package Recursion;

/*
Given a 2*n board and tiles of size 4*1, count the number of ways to tile the given board using the 4*1 tiles.
(A tile can either be placed horizontally or vertically).
 */
public class K_TillingProblem{

    public static int fixTile(int n){

        //Base case
        if(n == 0 || n == 1){
            return 1;
        }

        //Vertical choice
        int verticalChoice = fixTile(n-1);

        //Horizontal choice
        int horizontalChoice = fixTile(n-2);


        int totalWays = verticalChoice + horizontalChoice;
        return totalWays;
    }

    public static void main(String[] args) {

        //Calling function
        System.out.println(fixTile(5));

    }
}
