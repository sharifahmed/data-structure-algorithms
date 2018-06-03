package code.codility;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem6 {

    static class Solution {
        public int solution(int[] A) {
            int len = A.length;
            boolean[] found = new boolean[len + 1];

            for (int aA : A) {
                if (aA > len) {
                    return 0;
                }
                found[aA] = true;
            }

            for (int j = 1; j < len + 1; j++) {
                if (!found[j]) {
                    return 0;
                }
            }

            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3,1,2}));
    }
}
