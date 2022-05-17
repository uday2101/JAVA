public class Q58 { //java program to merge two sorted arrays 
    public static void mergeSortedArrays(int[] arr1, int n1, int[] arr2, int n2,int[] arr3){
        int i = 0 ,j = 0, k = 0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i<n1){
            arr3[k++] = arr1[i++]; //stroing remaining elements
        }
        while(j<n2){
            arr3[k++] = arr2[j++];
        }
    }
    public static void main(String[]args){
        int[] arr1 = {1,3,5,7};
        int n1 = arr1.length;

        int[] arr2 = {2,4,6,8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];
        mergeSortedArrays(arr1, n1, arr2, n2, arr3);
        System.out.println("Array after merging");
        for(int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
    
}
