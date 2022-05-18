import java.util.*;
public class Q63 {
    public static int diffElements(int[] arr){
        int diff_two_elements = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                diff_two_elements = Integer.max(diff_two_elements, arr[j]-arr[i]);
            }
        }
        return diff_two_elements;
    }
    public static void main(String[]args){
        int[] arr = {2,3,1,7,9,5,11,3,5};
        System.out.println("\nOriginal Array is : " +Arrays.toString(arr)); 
        System.out.println("The Max Diffference between the elements is\n" +diffElements(arr));
    }
}
