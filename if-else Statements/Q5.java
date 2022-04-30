import java.util.*;
public class Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int week = sc.nextInt();
        String day = "";
        switch(week){
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
            default: day = "Wrong day"; break;
        }
        System.out.println(day);
        sc.close();
    }
}
