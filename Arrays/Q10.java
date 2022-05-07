import java.util.Arrays;

public class Q10 {
    public static void main(String[]args){
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int []new_arr = new int[10];
        System.out.println("Original Array is : " +Arrays.toString(arr));
        for(int i =0; i<arr.length; i++){
            new_arr[i] = arr[i];
        }
        System.out.println("Duplicate Array is : " +Arrays.toString(new_arr));
    }
}
