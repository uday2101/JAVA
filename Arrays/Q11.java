import java.util.*;
public class Q11 {
    public static void main(String[]args){
        int []arr = {1,3,4,5,6,7,8,9,10};
        int index_pos = 1;
        int new_val = 2;
        System.out.println("Original Array is : " +Arrays.toString(arr));
        for(int i = arr.length-1; i>index_pos; i--){
            arr[i] = arr[i-1]; //Shifting elements
        }
        arr[index_pos] = new_val;
        System.out.println("New Array is : " +Arrays.toString(arr));
    }
}
