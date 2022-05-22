public class Q7 {
    public static void main(String[]args){
        char[] ch = {'1','2','3','4','5'};
        String str = String.copyValueOf(ch,1,3);
        System.out.println("\nThe book contains "+str+" pages.\n");
    }
}
