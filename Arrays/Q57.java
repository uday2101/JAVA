import java.util.*;
public class Q57{
    public static void sortBinaryArray(int[] arr){
        int k = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[k++] = 0;
            }
        }
        for(int i = k; i<arr.length; i++){
            arr[k++] = 1;
        }
    }
    public static void main(String[]args){
        int[] arr = {0,1,1,0,1,1,0,1,0,0};
        System.out.println("Original Array is : " +Arrays.toString(arr));
        sortBinaryArray(arr);
        System.out.println("Sorted Array is : " +Arrays.toString(arr));
    }
}