package BasicChallenges02.E_FindMissingLetter;

public class FindMissingLetter {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] {'a', 'b', 'c', 'd', 'f'})); // "e"
        System.out.println(findMissingLetter(new char[] {'O', 'Q', 'R', 'S'})); // "P"
        System.out.println(findMissingLetter(new char[] {'t', 'u', 'v', 'w', 'x', 'z'})); // "y"
    }

//    public static char findMissingLetter(char[] arr) {
//        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//
//        // look for the index of the first character
//        int startIndex = alphabet.indexOf(arr[0]);
//
//        // use the for loop to retrieve the number
//        for (int i = 0; i < arr.length; i++) {
//            char current = arr[i];
//            char shouldBe = alphabet.charAt(startIndex + i);
//
//            if (!(current == shouldBe)) {
//                return shouldBe;
//            }
//        }
//
//        return ' ';
//
//    }

    public static char findMissingLetter(char[] arr) {
        int start = (int) arr[0];

        // use the for loop to get the missing char
        for (int i = 0; i < arr.length; i++) {
            int shouldBe = start + i;
            int current = (int) arr[i];

            if (shouldBe != current) {
                return (char) shouldBe;
            }
        }

        return ' ';
    }
}
