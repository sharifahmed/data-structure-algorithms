package code.leetcode;

/**
 * @author sharifahmed
 * @since 5/19/18
 */
public class Problem268 {

    static class Solution {
        public int missingNumber(int[] nums) {
            int totalInArray = 0;
            int grandTotal = 0;

            for (int i = 1, len = nums.length; i <= len; i++) {
                grandTotal += i;
            }

            for (int num : nums) {
                totalInArray += num;
            }

            return grandTotal - totalInArray;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
