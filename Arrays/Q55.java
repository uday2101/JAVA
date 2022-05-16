import java.util.*;
public class Q55 {
    static boolean SubArrayExists(int[] arr){
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum +arr[i];
            if(sum == 0 || arr[i] == 0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[]args){
        int[] arr = {-3,2,3,1,6};
        if(SubArrayExists(arr)){
            System.out.println("Found a subarray with 0 sum");
        }
        else{
            System.out.println("No SubArray exists");
        }
    }
}
