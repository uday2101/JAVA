import java.util.*;
public class Q7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = 0;
        String m = " ";
        switch(month){
            case 1 : m = "Jan"; days = 31; break;
            case 2 : m = "Feb"; days = ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0)))?29:28; break;
            case 3 : m = "Mar"; days = 31; break;
            case 4 : m = "Apr"; days = 30; break;
            case 5 : m = "May"; days = 31; break;
            case 6 : m = "Jun"; days = 30; break;
            case 7 : m = "Jul"; days = 31; break;
            case 8 : m = "Aug"; days = 31; break;
            case 9 : m = "Sep"; days = 30; break;
            case 10 : m = "Oct"; days = 31; break;
            case 11 : m = "Nov"; days = 30; break;
            case 12 : m = "Dec"; days = 31; break;
            default : m = "Default";
        }
        System.out.println("Month " +m);
        System.out.println("Number of days " +days);
        sc.close();
    }
}
