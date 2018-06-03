package code.codility;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem3 {

    static class Solution {
        public int[] solution(int[] A, int K) {
            int len = A.length;

            if (len == 0) {
                return A;
            }

            for (int i = 0; i < K; i++) {
                int lastElement = A[len - 1];

                for (int k = len - 1, j = len - 2; j >= 0 && k >= 0; j--, k--) {
                    A[k] = A[j];
                }

                A[0] = lastElement;
            }

            return A;
        }
    }

    public static void main(String[] args) {
        Arrays.stream(new Solution().solution(new int[]{3, 8, 9, 7, 6}, 3)).forEach(System.out::print);
    }
}
