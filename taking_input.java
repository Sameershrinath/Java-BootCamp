import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Taking a full sentence as input (including spaces)
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Taking a single word input (without spaces)
        System.out.println("Enter a word: ");
        String word = scanner.next();  // next() is used for a single word
        
        // Taking an integer input
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Taking a floating-point input
        System.out.println("Enter a floating-point number: ");
        float decimal = scanner.nextFloat();
        
        // Taking a character input
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);  // charAt(0) extracts the first character
        
        // Display all the inputs
        System.out.println("You entered the sentence: " + sentence);
        System.out.println("You entered the word: " + word);
        System.out.println("You entered the integer: " + number);
        System.out.println("You entered the floating-point number: " + decimal);
        System.out.println("You entered the character: " + character);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}