package BasicChallenges02.I_FormatPhoneNumber;

import java.util.Arrays;

public class FormatPhoneNumber {
    public static void main(String[] args) {
        System.out.println(formatPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String formatPhoneNumber(int[] number) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                number[0], number[1], number[2],
                number[3], number[4], number[5],
                number[6], number[7], number[8], number[9]);
    }
}
