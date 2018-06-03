package code.leetcode;

/**
 * @author sharifahmed
 * @since 5/4/18
 */
public class Problem26 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int len = nums.length;

        for (int i = 0; i < len;) {
            if (i + 1 < len && nums[i] == nums[i + 1]) {
                for (int p = i, q = i + 1; p < q && q < len; p++, q++) {
                    nums[p] = nums[q];
                    nums[q] = Integer.MIN_VALUE;
                }
                len -= 1;
            } else {
                i++;
            }
        }

        int finalLength = 0;
        for (int num : nums) {
            if (num != Integer.MIN_VALUE) {
                finalLength++;
            }
        }

        return finalLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,0,0,0,3,3};
        System.out.println(removeDuplicates(nums));
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
        }
    }
}
