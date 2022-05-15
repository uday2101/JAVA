public class Q46 {
    static boolean pairinSortedRotated(int[] arr, int n, int x){
        //finding the pivot element
        int i;
        for(i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int l = (i+1)%n;
        int r = i; 
        while(l != r){
            if(arr[l]+arr[r] == x){
                return true;
            }
            if(arr[l]+arr[r]<x){
                l = (l+1) % n;
            }
            else{
                r = (n+r-1) % n;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] arr = {11,15,6,8,9,10};
        int sum = 16;
        int n = arr.length;
        if(pairinSortedRotated(arr, n, sum)){
            System.out.println("Array has two elements "+" with sum is 16");
        }
        else{
            System.out.println("Array doesn't have two elements with sum 16");
        }
    }
}
