package BasicChallenges01.J_CountVowels;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("hello")); // 2
        System.out.println(countVowels("why")); // 0
        System.out.println(countVowels("mississippi")); // 4

    }

    public static int countVowels(String str) {
        // parse through the string and add to the counter when a vowel is found
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                counter += 1;
            }
        }

        // return the counter
        return counter;
    }
}
