import java.util.Scanner;

public class Main {

    public static void printDecreasing(int number){

        //Base case
        if(number == 1){
            System.out.print(number);
            return;
        }

        //Defining, what to do
        System.out.print(number +  " ");
        printDecreasing(number-1);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        //Calling function
        printDecreasing(number);

    }
}