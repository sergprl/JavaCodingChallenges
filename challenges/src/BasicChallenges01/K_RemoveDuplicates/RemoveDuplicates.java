package BasicChallenges01.K_RemoveDuplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

        Integer[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(removeDuplicates(arr2)));
    }

    public static Integer[] removeDuplicates (Integer[] arr) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        return set.toArray(new Integer[0]);
    }
}
