package code.codility;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem8 {

    static class Solution {
        public int[] solution(int N, int[] A) {
            // write your code in Java SE 8

            int[] counter = new int[N];
            int max = -1;
            boolean hasMax = false;

            for (int k = 0, len = A.length; k < len; k++) {
                if (A[k] >= 1 && A[k] <= N) {
                    counter[A[k] - 1]++;

                    if (counter[A[k] - 1] > max) {
                        max = counter[A[k] - 1];
                        hasMax = true;
                    }
                } else if (A[k] == N + 1 && hasMax) {
                    for (int i = 0; i < N; i++) {
                        counter[i] = max;
                    }
                }
            }

            return counter;
        }
    }

    public static void main(String[] args) {
        Arrays.stream(new Solution().solution(1, new int[]{2, 1, 1, 2, 1})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Solution().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})).forEach(System.out::print);
    }
}
