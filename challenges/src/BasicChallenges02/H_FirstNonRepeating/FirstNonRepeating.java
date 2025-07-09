package BasicChallenges02.H_FirstNonRepeating;

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingCharacter("aabccdeff"));
        System.out.println(findFirstNonRepeatingCharacter("aabbcc"));
        System.out.println(findFirstNonRepeatingCharacter("abcdef"));
    }

    public static char findFirstNonRepeatingCharacter (String str) {
        // fill out the map
        HashMap<Character, Integer> map = new HashMap<> ();

        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if (map.containsKey(character)) {
                // if it is inside, update the value
                map.put(character, map.get(character) + 1);
            } else {
                // else, create the key, value pair
                map.put(character, 1);
            }
        }

        // iterate through the text to find the first char with frequency of 1
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (map.get(character) == 1) {
                return character;
            }
        }

        // or return none
        return ' ';
    }
}
