package PrefixSum;

import java.util.HashSet;
import java.util.Map;

public class PrefixSum {
    static void main() {
        int[] arr = {2, 4, 1, 5, 3};

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            set.add(sum);
        }

        System.out.println(set);
    }

//    static void main() {
//        int[] arr = {2, 4, 1, 5, 3};
//
//        int[] prefix = new int[arr.length];
//
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            prefix[i] = sum;
//        }
//
//        System.out.println(Arrays.toString(prefix));
//    }

//    public class Main {
//        public static void main(String[] args) {
//            int[] arr = {2, 4, 1, 5, 3};
//
//            int[] prefix = new int[arr.length];
//
//            prefix[0] = arr[0];
//
//            for (int i = 1; i < arr.length; i++) {
//                prefix[i] = prefix[i - 1] + arr[i];
//            }
//
//            for (int x : prefix) {
//                System.out.print(x + " ");
//            }
//        }
//    }
}
