package code.codility;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem5 {

    static class Solution {
        public int solution(int X, int[] A) {
            boolean[] found = new boolean[X + 1];
            int counter = 0;
            int result = -1;

            for (int i = 0, len = A.length; i < len; i++) {
                if (!found[A[i]]) {
                    found[A[i]] = true;
                    counter++;
                }
                if (counter == X) {
                    result = i;
                    break;
                }
            }

            for (int i = 1, len = found.length; i < len; i++) {
                if (!found[i]) {
                    return result;
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }
}