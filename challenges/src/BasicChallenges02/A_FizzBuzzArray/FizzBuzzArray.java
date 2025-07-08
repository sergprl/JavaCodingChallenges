package BasicChallenges02.A_FizzBuzzArray;

import java.util.Arrays;

public class FizzBuzzArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(5))); // [1, 2, "Fizz", 4, "Buzz"]
        System.out.println(Arrays.toString(fizzBuzz(15))); // [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
    }

    public static String[] fizzBuzz (int length) {
        String[] arr = new String[length];

        for (int i = 1; i <= length; i++) {
            if (i % 15 == 0) {
                arr[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i-1] = "Buzz";
            } else {
                arr[i-1] = Integer.toString(i);
            }
        }

        return arr;
    }
}
