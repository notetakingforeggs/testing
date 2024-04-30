public class StringManipulator {

    public static String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return input.equalsIgnoreCase(sb.toString());

    }
}