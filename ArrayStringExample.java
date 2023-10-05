
import java.util.Arrays;

public class ArrayStringExample {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = { 5, 2, 9, 1, 7 };

        // Accessing elements of the array
        int firstNumber = numbers[0]; // Access the first element (5)
        int length = numbers.length; // Get the length of the array (5)

        // Modify an element of the array
        numbers[3] = 10; // Change the fourth element to 10

        // Loop through the array and print each element
        System.out.print("Array elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Create a String
        String text = "Hello, World!";

        // Get the length of the String
        int textLength = text.length(); // Returns 13

        // Access characters in the String
        char firstChar = text.charAt(0); // Access the first character 'H'
        char lastChar = text.charAt(textLength - 1); // Access the last character '!'

        // Concatenate Strings
        String name = "Alice";
        String greeting = "Hello, " + name + "!"; // Concatenate strings

        // String comparison
        boolean isEqual = text.equals("Hello, World!"); // Check if text is equal to "Hello, World!"
        boolean containsWorld = text.contains("World"); // Check if text contains "World"

        // Splitting a String
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" "); // Split the sentence into an array of words

        // Joining an array of Strings
        String[] fruits = { "Apple", "Banana", "Orange" };
        String joinedFruits = String.join(", ", fruits); // Join the array elements with a delimiter

        // Substring
        String subText = text.substring(0, 5); // Get the substring from index 0 to 4 ("Hello")

        // Replace
        String replacedText = text.replace("Hello", "Hi"); // Replace "Hello" with "Hi"

        // Print results
        System.out.println("First number: " + firstNumber);
        System.out.println("Modified Array: " + Arrays.toString(numbers));
        System.out.println("Text Length: " + textLength);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);
        System.out.println("Greeting: " + greeting);
        System.out.println("Is equal to 'Hello, World!': " + isEqual);
        System.out.println("Contains 'World': " + containsWorld);
        System.out.println("Words in sentence: " + Arrays.toString(words));
        System.out.println("Joined Fruits: " + joinedFruits);
        System.out.println("Substring: " + subText);
        System.out.println("Replaced Text: " + replacedText);
    }
}
