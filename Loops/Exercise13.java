import java.util.*; // alternative logic for prime number
public class Exercise13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(flag && n>1){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}
