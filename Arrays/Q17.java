import java.util.*;
public class Q17 {
    public static void main(String[]args){
        int[] array1 = {1,2,3,4,5,6,7,8};
        int[] array2 = {9,10,11,12,5,7,3};
        System.out.println("Integer Array 1 is : " +Arrays.toString(array1));
        System.out.println("Integer Array 2 is : " +Arrays.toString(array2));
        HashSet<Integer> newset = new HashSet<Integer>();
        for(int i = 0; i<array1.length; i++){
            for(int j = 0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    newset.add(array1[i]);
                }
            }
        }
        System.out.println("Common elements are : " +(newset));
    }
}
