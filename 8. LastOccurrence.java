package Recursion;

//Write a function to find the last occurrence of an elements

/*
Approach
1. Look forward.
2. Compare with itself.
 */
public class H_LastOccurrence {

    public static int lastOccurrence(int arr[], int key, int i) {

        //Base case
        if(i == arr.length){
            return -1;
        }

        //Look forward
        int isFound = lastOccurrence(arr, key, i+1);

        //Comparing
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {

        int arr[] = {5,6,7,7,2,5,8,9,3};

        //calling function
        System.out.println(lastOccurrence(arr,7,0));
    }
}
