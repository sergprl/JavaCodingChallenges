package BasicChallenges01.F_TitleCase;

public class TitleCase {
    public static void main(String[] args) {
        System.out.println(titleCase("I'm a little tea pot"));
        System.out.println(titleCase("sHoRt AnD sToUt"));
        System.out.println(titleCase("HERE IS MY HANDLE HERE IS MY SPOUT"));
    }

    public static String titleCase(String str) {
        String [] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

}
