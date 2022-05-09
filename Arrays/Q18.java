import java.util.*;
public class Q18 {
    public static void removeDuplicates(int[] a){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<a.length; i++){
            set.add(a[i]);
        }
        System.out.println(set);
    }
    public static void main(String[]args){
        int[] a = {1,2,3,4,5,6,7,2,3,5};
        removeDuplicates(a);
    }
}
