package Recursion;

//Print the sum of first n natural numbers.
public class D_SumOfNaturalNum {

    public static int sumOfNaturalNum(int n){

        //Base case
        if(n == 1){
            return 1;
        }

        int s = sumOfNaturalNum(n-1); //Calling inner function

        int sN = n + sumOfNaturalNum(n-1);
        return sN;
    }

    public static void main(String[] args) {

        //Calling function
        System.out.println(sumOfNaturalNum(10));

    }
}
