package prep.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sharifahmed
 * @since 2019-10-07
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();

        for (Integer num : nums) {
            if (visited.contains(num)) {
                return true;
            }
            visited.add(num);
        }
        return false;
    }
}
