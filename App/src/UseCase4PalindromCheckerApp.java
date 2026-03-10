
import java.util.Scanner;

public class UseCase4PalindromCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Character Array) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        char[] chars = normalizedInput.toCharArray();

        boolean isPalindrome = checkPalindrome(chars);

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(char[] chars) {
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // no mismatches, it is a palindrome
    }
}