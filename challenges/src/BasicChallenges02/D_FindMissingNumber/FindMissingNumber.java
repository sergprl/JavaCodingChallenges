package BasicChallenges02.D_FindMissingNumber;

public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}));
        System.out.println(findMissingNumber(new int[]{10, 9, 6, 7, 5, 4, 2, 3, 1}));
        System.out.println(findMissingNumber(new int[]{11, 10, 6, 1, 2, 4, 7, 8, 3, 9}));
    }

    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return expectedSum - sum;
    }
}
