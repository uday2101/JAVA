import java.util.*;
public class Exercise4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int term = sc.nextInt();
        for(int i = 0; i<=term; i++){
            System.out.println(num +"*"+ i + "=" + num*i);
        }
        sc.close();
    }
}
