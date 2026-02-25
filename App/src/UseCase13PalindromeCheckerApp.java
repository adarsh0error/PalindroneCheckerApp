/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Measures and compares execution time of
 * different palindrome validation algorithms.
 *
 * Concepts:
 * - System.nanoTime()
 * - Algorithm benchmarking
 *
 * @author Developer
 * @version 13.0
 */

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // -------------------------------
        // Two Pointer Approach Benchmark
        // -------------------------------
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // -------------------------------
        // Stack Approach Benchmark
        // -------------------------------
        long startTime2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        System.out.println("\nTwo Pointer Result: " + result1);
        System.out.println("Execution Time: " + duration1 + " ns");

        System.out.println("\nStack Result: " + result2);
        System.out.println("Execution Time: " + duration2 + " ns");

        scanner.close();
    }

    // Two-pointer algorithm
    private static boolean twoPointerCheck(String input) {
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

    // Stack-based algorithm
    private static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}