package BasicChallenges01.G_ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseString("world"));
    }

    // Bad practice, should not concatenate within a for loop, use StringBuilder instead
//    public static String reverseString(String str) {
//        String reversed = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//
//        return reversed;
//    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

}
