import java.util.*;
public class Q59 { //Shuffle elements of an array 
    static void randomize(int[] arr, int n){
        Random r = new Random();
        for(int i = n-1; i>0; i--){
            int j = r.nextInt(i+1); //picking random index from the array
            //swapping the elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }    
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        randomize(arr, n);
    }
}
