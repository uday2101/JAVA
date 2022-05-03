import java.util.*;
public class Exercise10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int k = 1;
        for(int i =1; i<=rows; i++){
            for(int j =1; j<=i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}