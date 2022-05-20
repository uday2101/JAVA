import java.util.*; // Armstrong Number
public class Exercise16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum = sum+ (int)Math.pow(temp,3);
            n = n/10;
        }
        if(sum == num){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
        sc.close();
    }
}
