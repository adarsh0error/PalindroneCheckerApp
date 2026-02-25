/**
 * ==========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Demonstrates dynamic selection of palindrome algorithm
 * using Strategy Design Pattern.
 *
 * Concepts:
 * - Interface
 * - Polymorphism
 * - Strategy Pattern
 *
 * @author Developer
 * @version 12.0
 */

import java.util.*;

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.check(input);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-Based Strategy
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

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

/**
 * Deque-Based Strategy
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}