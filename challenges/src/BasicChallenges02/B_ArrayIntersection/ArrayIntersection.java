package BasicChallenges02.B_ArrayIntersection;

import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayIntersection(
                new Integer[]{1, 2, 3, 4, 5},
                new Integer[]{1, 3, 5, 7, 9}))); // should return [1, 3, 5]
        System.out.println(Arrays.toString(arrayIntersection(
                new Integer[]{1, 1, 1, 1, 1},
                new Integer[]{2, 2, 2, 2, 2}))); // should return []
        System.out.println(Arrays.toString(arrayIntersection(
                new Integer[]{1, 2, 3, 4, 5},
                new Integer[] {5, 4, 3, 2, 1}))); // should return [1, 2, 3, 4, 5]

    }

//    // version 1
//    public static Integer[] arrayIntersection (Integer[] arr1, Integer[] arr2) {
//        List<Integer> intersectionArr = new ArrayList<>();
//
//        // parse through all the values in arr1
//        for (Integer integer : arr1) {
//            // compare all the values with those in arr2
//            // also, make sure the value isn't already in the intersectionArr
//            if (Arrays.asList(arr2).contains(integer) && !intersectionArr.contains(integer)) {
//                intersectionArr.add(integer);
//            }
//        }
//
//        return intersectionArr.toArray(new Integer[0]);
//    }

    // version 2
    public static Integer[] arrayIntersection (Integer[] arr1, Integer[] arr2) {
        Set<Integer> setArr1 = new LinkedHashSet<>(Arrays.asList(arr1));
        Set<Integer> setArr2 = new LinkedHashSet<>(Arrays.asList(arr2));
        Set<Integer> intersectionSet = new LinkedHashSet<>();

        for (Integer integer: setArr1) {
            if (setArr2.contains(integer)) {
                intersectionSet.add(integer);
            }
        }

        return intersectionSet.toArray(new Integer[0]);
    }
}
