package work;
import java.util.Scanner;
// code for sum of all odd numbers from 1 to n
public class Work2 {
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = sumOfOddNumbers(n);
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + result);
    }
    
    

}
