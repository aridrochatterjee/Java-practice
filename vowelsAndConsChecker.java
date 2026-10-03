import java.util.Scanner;

public class vowelsAndConsChecker {
    public static String check(String input) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }
        return "Number of vowels: " + vowelCount + "\nNumber of consonants: " + consonantCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Validate BEFORE processing
        if (input.trim().isEmpty()) {
            System.out.println("Please enter a valid string.");
            return;
        }else if (input.matches("\\d+")) {
            System.out.println("Please enter a string with letters.");
            return;
        }   

        System.out.println(check(input));
    }
}   
