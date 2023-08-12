import java.util.Scanner;

public class B_Increasing {

    public static void printInc(int number){

        //Base case
        if(number == 1){
            System.out.print(number+" ");
            return;
        }

        //Calling Inner Function
        printInc(number-1);

        //Defining, to do
        System.out.print(number+" ");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        //Calling function
        printInc(number);

    }
}
