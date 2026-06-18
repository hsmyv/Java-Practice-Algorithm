package PrefixSum;

import java.util.HashSet;
import java.util.Map;

public class PrefixSum {


    public static void main(String[] args) {
        int[] arr = {1, 2, 5 ,9};

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int p : prefix){
            System.out.println(p + " ");
        }
    }


}

