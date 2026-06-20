package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static void main() {
        int[] nums = {3, 2, 4, 7, 11};
        int target = 6;  //[1, 2]
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
