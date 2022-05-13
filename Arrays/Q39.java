public class Q39 {
    void findLeaders(int[] arr, int size){
        for(int i = 0; i<size; i++){
            int j;
            for(j = i+1; j<size; j++){
                if(arr[i] <= arr[j]){
                    break;
                }
            }
            if(j == size){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public static void main(String[]args){
        Q39 Leader = new Q39();
        int[] arr = new int[]{16,17,4,3,5,2};
        int size = arr.length;
        Leader.findLeaders(arr, size);
    }
}
