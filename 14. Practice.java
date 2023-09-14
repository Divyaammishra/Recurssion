package Recursion.Question;


/*
    Q. For a given integer array of size N. You have to find all the occurrences(indices) of a given element(Key) and print them.
    Use a recursive function to solve this problem.

    Example
        Sample Input: arr[ ] = {1, 2, 4, 3, 4, 5, 6, 4, 7, 8, 9}, key = 4                                                                                                                                
        Sample Output: 2 4 7
 */
public class First {

    public static void returnKeyIndex(int array[], int key, int i){

        //Base case
        if(i == array.length){
            return;
        }

        if(array[i] == key){
            System.out.println(i + " ");
        }

        //Inner Function
        returnKeyIndex(array, key, i+1);
    }

    public static void main(String[] args) {

        int array[] = {1, 2, 4, 3, 4, 5, 6, 4, 7, 8, 9};
        int key = 4;

        returnKeyIndex(array, key, 0);
    }
}
