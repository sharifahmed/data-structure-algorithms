package main.java.prep.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 5/3/18
 */
public class TwoSum {

    public static void main(String[] args) {
        IntStream.of(twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
