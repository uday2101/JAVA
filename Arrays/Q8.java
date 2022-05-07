public class Q8 {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int index = 0;
        int element = 3;
        for(int i = 0; i<arr.length; i++){
            if(element == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
