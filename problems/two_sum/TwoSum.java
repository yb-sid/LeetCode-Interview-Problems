package problems.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] example = new int[] { 2, 1, 11, 7 };
        int[] expected = new int[] { 0, 3 };

        System.out.println("Expected output is : " + Arrays.toString(expected)
                + "output of solution is : " + Arrays.toString(twoSum(example, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapping = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int complement = target - current;
            if (mapping.containsKey(complement)) {
                return new int[] { i, mapping.get(complement) };
            }
            mapping.put(current, i);
        }
        return new int[2];
    }
}