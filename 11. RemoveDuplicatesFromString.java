package Recursion;

public class L_RemoveDuplicatesFromString {

    public static void removeDuplicates(String string, int index, StringBuilder newString, boolean[] map){

        //Base case
        if(index == string.length()){
            System.out.println(newString);
            return;
        }

        char currentChar = string.charAt(index);
        if(map[currentChar - 'a'] == true){

            //if duplicates
            removeDuplicates(string,index+1,newString,map);
        }else{
            map[currentChar - 'a'] = true;
            removeDuplicates(string, index+1, newString.append(currentChar),map);
        }
    }

    public static void main(String[] args) {

        String string = "aabbcdefghiij";

        removeDuplicates(string, 0, new StringBuilder(""), new boolean[26]);
    }
}
