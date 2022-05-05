import java.util.*;
public class GregorianCalendar{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        int ref_year = 1990;
        int total_days = 0;
        int day = 0;
        int leap = 0;
        String d = " ";
        int diff = year - ref_year;
        while(ref_year < year){
            if(ref_year % 100 == 0){
                if(ref_year % 400 == 0){
                    leap++;
                }
            }
            else{
                if(ref_year % 4 == 0){
                    leap++;
                }
            }
            ref_year++;
        }
        total_days = (diff -leap)*365 + (leap*366);
        day = total_days % 7;
        
        switch(day){
            case 0: d = "Monday"; break;
            case 1: d = "Tuesday"; break;
            case 2: d = "Wednesday"; break;
            case 3: d = "Thursday"; break;
            case 4: d = "Friday"; break;
            case 5: d = "Saturday"; break;
            case 6: d = "Sunday"; break;
        }
        System.out.println("\nThe day on 01 January was " +d);
    }
}