package Recursion;

//Write a function to find the first occurrence fo an element in an array
public class G_FindElement {

    public static int findElement(int arr[], int key, int i){

        //Base case
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        //Calling inner function
        return findElement(arr, key, i+1);
    }
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,9,10,5};

        //Calling function
        System.out.println(findElement(arr,5,0));
    }
}
