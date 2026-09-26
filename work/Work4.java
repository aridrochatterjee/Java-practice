package work;
import java.util.Scanner;
// code for area of circle
public class Work4 {
    public static int product(double pie , int r){
        pie = 3.14;
        int area = (int) (pie * r * r);
        return area;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        int result = product(0, r);
        System.out.println("The area of the circle with radius " + r + " is: " + result);
    }

    
}
