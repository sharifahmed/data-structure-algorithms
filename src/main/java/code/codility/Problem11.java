package code.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 5/15/18
 */
public class Problem11 {

    static class Solution {

        public int solution(int[] A) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0, len = A.length; i < len; i++) {
                if (!list.contains(A[i])) {
                    list.add(A[i]);
                }
            }

            return list.size();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2, 1, 1, 2, 3, 1}));
    }
}
