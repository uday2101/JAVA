import java.util.*;
public class Q56{
    public static void printAllSubarrays(int[] arr){
        List<Integer> llist = new ArrayList<>();    
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            llist.removeAll(llist);
            for(int j =0; j<arr.length; j++){
                sum = sum +arr[j];
                llist.add(arr[j]);
                if(sum == 0){
                    System.out.println("SubArrays with 0 sum are : " +llist.toString());
                }
            }
        }
    }
    public static void main(String[]args){
        int[] nums1 = {1,3,-7,3,2,3,1,-3,-2,-2};
        System.out.println("\nOriginal Array: "+Arrays.toString(nums1));
        printAllSubarrays(nums1);

        int[] nums2 = {1,2,-3,4,5,6};
        System.out.println("\nOriginal Array: "+Arrays.toString(nums2));
        printAllSubarrays(nums2);
    }
}