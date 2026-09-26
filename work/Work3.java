package work;
import java.util.Scanner;

// code for 2 numbers and give output of which number is greater

public class Work3 {
    public static String number(int x, int y , String z){
        if (x >y){
            return String.valueOf(x);
        } else if (y == x){
            z = "Both numbers are equal.";
            return z;
        }
        else {
            return String.valueOf(y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        String result = number(x, y, "");
        System.out.println("The greater number between " + x + " and " + y + " is: " + result);
    }

    
}
