package code.codility;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem4 {

    static class Solution {

        public int solution(int[] A) {
            int len = A.length;

            if (len == 1) {
                return A[0];
            }

            boolean[] found = new boolean[len];

            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (A[i] == A[j]) {
                        found[i] = found[j] = true;
                        break;
                    }
                }
            }

            for (int k = 0; k < len; k++) {
                if (!found[k]) {
                    return A[k];
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{9,3,9,3,9,7,9}));
    }
}
