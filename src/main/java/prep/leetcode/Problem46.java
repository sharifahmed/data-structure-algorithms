package main.java.prep.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 5/19/18
 */
public class Problem46 {

    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            permutations(nums, 0, result);
            return result;
        }

        private void permutations(int[] nums, int start, List<List<Integer>> result) {
            if (start >= nums.length) {
                result.add(asList(nums));
                return;
            }

            for (int i = start, len = nums.length; i < len; i++) {
                swap(nums, start, i);
                permutations(nums, start + 1, result);
                swap(nums, start, i);
            }
        }

        private List<Integer> asList(int[] nums) {
            List<Integer> list = new ArrayList<>();

            for (Integer num : nums) {
                list.add(num);
            }

            return list;
        }

        private void swap(int[] nums, int i, int j) {
            if (i == j) {
                return;
            }

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2, 3}));
    }
}
