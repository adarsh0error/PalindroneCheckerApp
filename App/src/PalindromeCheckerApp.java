//version 2.0
//author Adarsh
//useCase1: Welcome Page
//useCase 2: hard code palindrome logic
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main() {
        System.out.println("welcome to palindrome checker app management system");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.nextLine();
        String reversed = "";
        for(int i = input.length()-1; i>=0; i++){
            reversed+=input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}

