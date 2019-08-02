package main.java.prep.codility;

/**
 * @author sharifahmed
 * @since 5/15/18
 */
public class Problem10 {

    static class Solution {

        public int solution(int[] A) {
            int max = Integer.MIN_VALUE;
            int len = A.length;

            for (int p = 0; p < len - 2; p++) {
                for (int q = p + 1; q < len - 1; q++) {
                    for (int r = q + 1; r < len; r++) {
                        int product = A[p] * A[q] * A[r];

                        if (product > max) {
                            max = product;
                        }
                    }
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{-3, 1, 2, -2, 5, 6}));
        System.out.println(new Solution().solution(new int[]{-5, -5, 5, 4}));
    }
}
