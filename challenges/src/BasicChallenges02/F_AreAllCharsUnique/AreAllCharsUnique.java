package BasicChallenges02.F_AreAllCharsUnique;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AreAllCharsUnique {
    public static void main(String[] args) {
        System.out.println(areAllCharactersUnique("abcdefg"));  // true
        System.out.println(areAllCharactersUnique("abcdefgA")); // true
        System.out.println(areAllCharactersUnique("programming"));  // false
        System.out.println(areAllCharactersUnique(""));     // true
        System.out.println(areAllCharactersUnique("a"));    // true
    }

    // case sensitive
    // true by default
//    public static boolean areAllCharactersUnique (String str) {
//        // fill out the data
//        Map<String, Boolean> charCount = new HashMap<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            String character = String.valueOf(str.charAt(i));
//            if (charCount.containsKey(character)) {
//                return false;
//            } else {
//                charCount.put(character, true);
//            }
//        }
//        return true;
//    }

    public static boolean areAllCharactersUnique (String str) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if (set.contains(str.charAt(i))) {
                return false;
            } else {
                set.add(str.charAt(i));
            }
        }
        return true;
    }
}
