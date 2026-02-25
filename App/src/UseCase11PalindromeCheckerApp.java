/**
 * ==========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation
 * using object-oriented design principles.
 *
 * The palindrome logic is encapsulated inside
 * a separate PalindromeService class.
 *
 * Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * @author Developer
 * @version 11.0
 */

import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}