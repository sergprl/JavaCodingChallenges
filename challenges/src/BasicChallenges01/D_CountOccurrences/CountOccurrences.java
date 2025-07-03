/**
 * Returns the number of occurrences of a character in a string.
 * @param {string} str - The string to search.
 * @param {string} char - The character to search for.
 * @returns {number} - The number of occurrences of the character in the string.
 */

package BasicChallenges01.D_CountOccurrences;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(countOccurrences("hello", 'h'));
    }

    public static int countOccurrences(String str, char character) {
        int counter = 0;

        for(int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == character) {
                counter ++;
            }
        }

        return counter;
    }
}
