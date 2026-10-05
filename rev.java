import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strings = sc.nextLine();
        for (int i = strings.length() - 1; i >= 0; i--) {
            System.out.print(strings.charAt(i));
        }
        System.out.println();
        sc.close();
    }
}
        