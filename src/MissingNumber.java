//Imagine a list of numbers from 1 to max_num, inclusive - except that one of these numbers will be missing from the list.
// Write a function that takes this list of numbers, as well as the max_num, and it should return the missing number.

import java.util.Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] numbers, int maxNum) {
        // Calculate the expected sum of numbers from 1 to maxNum
        int expectedSum = maxNum * (maxNum + 1) / 2;

        // Calculate the actual sum of the numbers in the array
        int actualSum = Arrays.stream(numbers).sum();

        // The missing number is the difference between the expected sum and the actual sum
        int missingNumber = expectedSum - actualSum;

        if (missingNumber >= 1 && missingNumber <= maxNum) {
            return missingNumber;
        } else {
            return 0; // No missing number found in the valid range
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;

        int result = findMissingNumber(numbers, maxNum);

        if (result != 0) {
            System.out.println("Missing Number: " + result);
        } else {
            System.out.println("No missing number found in the valid range.");
        }
    }
}