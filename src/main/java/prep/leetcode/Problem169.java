package main.java.prep.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 5/19/18
 */
public class Problem169 {

    static class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> countMap = new HashMap<>();
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                countMap.put(nums[i], countMap.get(nums[i]) == null ? 1 : countMap.get(nums[i]) + 1);
            }

            int element = nums[0], max = -1;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > max) {
                    element = entry.getKey();
                    max = entry.getValue();
                }
            }

            return element;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
