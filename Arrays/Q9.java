import java.util.Arrays;

public class Q9 {
    public static void main(String[]args){
        int []arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original array is : " +Arrays.toString(arr));
        int removeIndex = 2;
        for(int i = removeIndex; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println("After the removal of third element" +Arrays.toString(arr));
    }
}
