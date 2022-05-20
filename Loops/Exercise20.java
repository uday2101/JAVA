// LCM of two numbers
public class Exercise20 {
    public static void main(String[]args){
        int n1 = 72;
        int n2 = 120;
        int gcd = 1; 
        for(int i = 1; i<=n1 && i<=n2; ++i){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }
        int lcm = (n1*n2)/gcd;
        System.out.println("The lcm is : " +lcm);
    }
}
