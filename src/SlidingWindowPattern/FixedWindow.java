package SlidingWindowPattern;

//Max Sum Subarray Size K
public class FixedWindow {
    public static int maxSumSubarray(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < arr.length; right++) {
            windowSum += arr[right];
            windowSum -= arr[right - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    static void main() {
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;

        System.out.println(maxSumSubarray(arr1, k1)); // 9

    }
}
