package PrefixSum;

import java.util.HashMap;
import java.util.Map;

//Tapşırıq
//Array və k verilir.
//Sən tapmalısan:
//cəmi k olan neçə subarray var?

public class SubarraySumEqualsK {
        public static int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0;
            int count = 0;

            for (int num : nums){
                sum += num;

                if(map.containsKey(sum - k)){
                    count += map.get(sum - k);
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
                System.out.println(map);
            }
            return  count;
        }

        public static void main(String[] args) {

            int[] nums = {4, 0, 0};

            int k = 4;

            System.out.println(subarraySum(nums, k)); // 2
        }
}
