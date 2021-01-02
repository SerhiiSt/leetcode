package numbers;

//9. Palindrome Number

/**
 * Determine whether an integer is a palindrome. A
 * n integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int number = x;
        int reverseNumber = 0;
        while (x != 0) {
            int reminder = x % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            x /= 10;
        }

        return number == reverseNumber;

    }
}