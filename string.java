public class string {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
        
        // Get length of the string
        int length = str.length();
        System.out.println("Length of the String: " + length);
        
        // Check if the string contains a substring
        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);
        
        // Replace a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Split the string
        String[] splitStr = str.split(", ");
        System.out.println("Split String:");
        for (String s : splitStr) {
            System.out.println(s);
        }
    }
    
}
