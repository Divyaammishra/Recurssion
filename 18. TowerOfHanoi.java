package Recursion.Question;

/*
    Q. Tower of Hanoi

    You have 3 towers and N disks of different sizes which can slide on to any tower.
    The puzzle starts with disks sorted in ascending order of size from top to bottom
    (i.e.,each disk sits on top of an even larger one)
    
 */

public class Fifth {

    public static void towerOfHanoi(int n, String source, String helper, String destination){

        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        //Transfer top n-1 from source to helper using destination as helper
        towerOfHanoi(n - 1, source, destination, helper);

        //Transfer nth from source to destination
        System.out.println("Transfer disk " + n + " from " + source + " to " + helper);

        //Transfer n - 1 from helper to destination using source as helper
        towerOfHanoi(n - 1, helper, source, destination );
    }
    public static void main(String[] args) {

        int n = 3;

        towerOfHanoi(n, "A", "B", "C");

    }
}
