public class Q6 {
    public static void main(String[]args){
        int a[] = {1,2,3,4,5,};
        int sum = 0;
        double avg = 0.0;
        for(int i: a){
            sum = sum+i;
            avg = sum/a.length;
        }
        System.out.println("The average is "+avg);
    }
}
