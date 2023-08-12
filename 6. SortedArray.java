package Recursion;

//Check if given array is sorted or not...
public class F_SortedArray {

    public static boolean isSorted(int arr[], int i){

        //Base case
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        //Calling inner function
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {

        int arr[] = {2,3,4,5,7,6};

        //Calling function
        System.out.println(isSorted(arr, 0));

    }
}
