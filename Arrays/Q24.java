import java.util.Arrays;

public class Q24 {
    public static void main(String[]args){
        int a[] = {1,2,3,4,5,6,7};
        int b[] = {1,2,3,4,5,7,8};
        boolean result = Arrays.equals(a, b);
        if(result == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
