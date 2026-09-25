import java.util.*;
public class BasicCalculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your 1st number: ");
        int a = sc.nextInt();
        System.out.print("Your 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Your Operator: ");
        String operator = sc.next();
        if(operator.equals("+")){
            System.out.println("The sum is: " + (a + b));
        } else if (operator.equals("-")){
            System.out.println("The difference is: " + (a - b));
        } else if (operator.equals("*")){
            System.out.println("The product is: " + (a * b));
        } else if (operator.equals("/")){
            System.out.println("The quotient is: " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
                
            
    }

}
