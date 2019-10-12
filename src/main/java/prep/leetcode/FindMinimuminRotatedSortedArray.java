package prep.leetcode;

import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 2019-10-12
 */
public class FindMinimuminRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
    }

    public static int findMin(int[] nums) {
        return IntStream.of(nums).min().getAsInt();
    }
}
