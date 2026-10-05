public class reverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strings = sc.nextLine();
        new StringBuilder(strings).reverse().toString();
        System.out.println("Reversed String: " + new StringBuilder(strings).reverse().toString());
        sc.close();
    
}
}