import java.util.Scanner;

public class PalindromeUC10 {

    public static boolean isPalindrome(String str) {

        // Step 1: Normalize the string
        str = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = str.length() - 1;

        // Step 2: Compare characters
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        scanner.close();
    }
}