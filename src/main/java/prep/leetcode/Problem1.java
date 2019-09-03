package main.java.prep.leetcode;

/**
 * @author sharifahmed
 * @since 5/3/18
 */
public class Problem1 {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] values = new int[2];

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    values[0] = i;
                    values[1] = j;
                    return values;
                }
            }
        }

        return values;
    }
}
