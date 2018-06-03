package code.codility;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem9 {

    static class Solution {
        public int solution(int A, int B, int K) {
            if (B < K) {
                return 0;
            }

            int b = B / K;
            int a = A == 0 ? 0 : (A - 1) / K;

            if (a == 0) {
                b++;
            }

            return b - a;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 10, 5));
    }
}
