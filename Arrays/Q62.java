public class Q62 {
    static void Replace(int[] arr){
        int n = arr.length;
        int Product = 1;
        for(int i =0; i<n; i++){
            Product = Product*arr[i];
        }
        for(int i =0; i<n; i++){
            arr[i] = Product/arr[i];
        }
    }
    public static void main(String[]args){
        int[] arr = {2,3,3,5,7};
        Replace(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
