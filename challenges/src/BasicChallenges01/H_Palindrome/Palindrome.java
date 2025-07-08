package BasicChallenges01.H_Palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("")); // true
    }

    public static boolean isPalindrome(String str) {
        // build the reversed string
            // use StringBuilder, see G_ReversedString for why this is done
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        // compare if reversed and original are similar
        return reversed.toString().equalsIgnoreCase(str);
    }
}
