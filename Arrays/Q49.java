import java.util.*;
public class Q49 {
    static void rearrange(int[] arr, int n){
        int temp[] = arr.clone();
        int small = 0; 
        int large = n-1;
        boolean flag = true;
        for(int i = 0; i<n; i++){
            if(flag){
                arr[i] = temp[large--];
            }
            else{
                arr[i] = temp[small++];
            }
            flag = !flag;
        }
    }
    public static void main(String[]args){
        int[] arr = new int[] {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));
        rearrange(arr, n);
        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }
}
