import java.util.Arrays;
import java.util.List;

public class NumeralSorter {

    private static final List<String> NUMERALS = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

    public static String sortNumerals(String input) {
        // Check for null or empty input
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Split the input string into an array of words
        String[] words = input.split(" ");

        // Sort the words using the NUMERALS list for ordering
        Arrays.sort(words, (a, b) -> NUMERALS.indexOf(a) - NUMERALS.indexOf(b));

        // Join the sorted words back into a string with space delimiters
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "five zero two nine eight";
        String test2 = "one three four seven six";

        System.out.println("Input: " + test1);
        System.out.println("Sorted: " + sortNumerals(test1));

        System.out.println("\nInput: " + test2);
        System.out.println("Sorted: " + sortNumerals(test2));
    }
}
