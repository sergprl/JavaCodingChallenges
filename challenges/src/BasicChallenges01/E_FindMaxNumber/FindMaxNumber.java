/**
 * Returns the largest number in an array.
 * @param {number[]} arr - The array of numbers.
 * @returns {number} - The largest number in the array.
 */

package BasicChallenges01.E_FindMaxNumber;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};

        try {
            System.out.println(findMaxNumber(arr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int findMaxNumber(int[] arr) throws Exception{
        if (arr.length == 0) {
            throw new Exception("Array is empty.");
        }

        int maxNumber = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }
}
