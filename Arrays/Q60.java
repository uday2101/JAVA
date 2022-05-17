import java.util.*;
public class Q60 {
   public static void swap(int[] arr, int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
   public static void Rearrange(int[] arr , int n){
       for(int i = 0; i<n-1; i = i+2){ //common code for even and odd lengths
           if(arr[i]>arr[i+1]){
               swap(arr, i, i+1);
           }
       }
       if((n & 1)>0){
           for(int i = n-1; i>0; i = i-2){
               if(arr[i]>arr[i-1]){
                   swap(arr, i, i-1);
               }
           }
       }
   }
   public static void main(String[]args){
       int[] arr = {1,2,3,4,5,6,7,8,9};
       System.out.println("Before Rearranging ");
       System.out.println(Arrays.toString(arr));
       Rearrange(arr, arr.length);
       System.out.println("After Rearranging ");
       System.out.println(Arrays.toString(arr));
   }
}
