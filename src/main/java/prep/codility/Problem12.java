package main.java.prep.codility;

/**
 * @author sharifahmed
 * @since 5/15/18
 */
public class Problem12 {

    static class Solution {

        public int solution(int[] A) {
            int len = A.length;

            for (int P = 0; P < len; P++) {
                for (int Q = P + 1; Q < len; Q++) {
                    for (int R = Q + 1; R < len; R++) {
                        if (A[P] + A[Q] > A[R] && A[Q] + A[R] > A[P] && A[R] + A[P] > A[Q]) {
                            return 1;
                        }
                    }
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{10, 2, 5, 1, 8, 20}));
        System.out.println(new Solution().solution(new int[]{10, 50, 5, 1}));
    }
}
