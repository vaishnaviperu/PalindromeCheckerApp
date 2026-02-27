import java.util.Scanner;
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
