package TwoPointers;
import java.util.*;

public class ReverseString {

    public static void reverseString(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
    }


    static void main() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        reverseString(chars);
        System.out.println(Arrays.toString(chars)); // [o, l, l, e, h]
    }
}
