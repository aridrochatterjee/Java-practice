package work;
import java.util.Scanner;
public class Work1{
    public static int number(int a , int b , int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");      
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int result = number(a, b, c);
        System.out.println("The sum of " + a + ", " + b + ", and " + c + " is: " + result);
    }
    
}
