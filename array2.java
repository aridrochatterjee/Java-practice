//Find the maximum & minimum number in an array of integers. 
import java.util.*;
public class array2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];


        // input

        for(int t = 0;t<size;t++){
            num[t] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
     
        for(int i=0; i<num.length; i++) {
            if(num[i] < min) {
               min = num[i];
           }
           if(num[i] > max) {
                max = num[i];
           }
       }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
      
   }
}

    

