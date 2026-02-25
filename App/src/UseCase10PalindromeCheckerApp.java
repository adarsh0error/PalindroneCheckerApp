/**
 * ==========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and special characters
 * - Converting to lowercase
 *
 * Example:
 * "A man a plan a canal Panama" -> true
 *
 * @author Developer
 * @version 10.0
 */

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string:
        // Remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Two-pointer style comparison
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}