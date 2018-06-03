package code.codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sharifahmed
 * @since 5/13/18
 */
public class Problem1 {

    static class Solution {
        public int solution(int[] A) {
            List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

            for (int i = 1; i < 100000; i++) {
                if (!list.contains(i)) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3};

        Solution sol = new Solution();
        System.out.print(sol.solution(input));
    }
}
