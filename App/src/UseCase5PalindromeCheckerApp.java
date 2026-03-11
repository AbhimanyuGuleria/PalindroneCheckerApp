import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Stack) ===");
        System.out.print("Enter a string to check if it is a palindrome: ");
        String original = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        StringBuilder reversedBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedBuilder.append(stack.pop());
        }
        String reversed = reversedBuilder.toString();

        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
