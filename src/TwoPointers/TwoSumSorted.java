package TwoPointers;
import java.util.*;

public class TwoSumSorted {
    // 1. Sorted array-də iki ədədin cəmi target olsun
    public static int[] twoSumSorted(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; //if return the indices of the two numbers, indexed from 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    static void main() {
        int[] arr1 = {1, 2, 3, 4, 6};
        int target = 6;

        System.out.println(Arrays.toString(twoSumSorted(arr1, target))); // [1, 3]
    }
}
