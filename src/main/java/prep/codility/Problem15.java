package main.java.prep.codility;

/**
 * @author sharifahmed
 * @since 5/20/18
 *
 * StrSymmetryPoint
 */
public class Problem15 {

    static class Solution {

        public int solution(String S) {
            if (S.length() == 1) {
                return 0;
            }

            for(int i = 1, len = S.length(); i < len; i++) {
                String left = S.substring(0, i);
                StringBuilder sb = new StringBuilder(S.substring(i + 1, len));
                String right = sb.reverse().toString();

                if (left.equals(right)) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("racecar"));
        System.out.println(new Solution().solution(" "));
    }
}
