package Recursion.Question;

/*
    Q. Given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.

    Example ->
        Input : S = "abab"
        Output : 6
        The substrings are a, aba, b, bab, a and b.

 */
public class Fourth2 {

    public static int countSubstring(String string, int i, int j, int n){

        //Base Case
        if(n <= 0){
            return 0; //If empty
        }
        if(n == 1){
            return 1; //if, only one character
        }

        //Main Code
        int count = countSubstring(string, i + 1, j, n - 1) + //By excluding first letter
                    countSubstring(string, i, j - 1, n - 1) - //By excluding last letter
                    countSubstring(string, i + 1, j - 1, n - 2); // By excluding both first and last letter

        if(string.charAt(i) == string.charAt(j)){
            count++;
        }

        return count;
    }
    public static void main(String[] args) {

        String string = "abab";
        int n = string.length();

        System.out.println(countSubstring(string, 0, n-1, n));

    }
}
