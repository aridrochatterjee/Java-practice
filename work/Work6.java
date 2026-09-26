package work;
public class Work6 {
    
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter numbers (type 'exit' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit' to finish.");
            }
        }

        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zeroes entered: " + zeroCount);
    }
}
