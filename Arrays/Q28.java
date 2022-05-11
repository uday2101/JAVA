import java.util.*;
public class Q28 {
    public static void main(String[]args){
        int[] arr = {1,12,13,24,34,56,76,77,5};
        int counter = 0;
        System.out.println("Original Array is : " +Arrays.toString(arr));
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                counter++;
            }
        }
        System.out.println("Number of even numbers are : " +counter);
        System.out.println("Number of odd numbers are : " +(arr.length-counter));
    }
}
