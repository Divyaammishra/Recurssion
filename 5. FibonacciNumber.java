//Calculate fibonacci number
public class E_Fibonacci {
    public static int fibonacciNum(int n){

        //Base case
        if(n==0 || n==1){
            return n;
        }
        int fibonacciN = fibonacciNum(n-1) + fibonacciNum(n-2); //Inner function

        return fibonacciN;
    }

    public static void main(String[] args) {

        //Calling function
        System.out.println(fibonacciNum(6));

    }
}
