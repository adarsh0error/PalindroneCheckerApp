/**
 * ==========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from outer positions
 * moving inward using recursive calls.
 *
 * Recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * @author Developer
 * @version 9.0
 */

import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Mismatch condition
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}