public class Q12 {
    int min(int[] numbers){
       int min = Integer.MAX_VALUE;
       for(int i = 0; i<numbers.length; i++){
           if(min>numbers[i]){
               min = numbers[i];
           }
       }
       return min;
   }
    int max(int[] numbers){
       int max = Integer.MIN_VALUE;
       for(int i = 0; i<numbers.length; i++){
           if(max<numbers[i]){
               max = numbers[i];
           }
       }
       return max;
   }
   public static void main(String[]args){
       int []numbers = {1,2,3,4,5,6,7,8,9};
       Q12 m = new Q12();
       System.out.println("Maximum value of the array is : " +m.max(numbers));
       System.out.println("Minimum value of the array is : " +m.min(numbers));
   }
}
