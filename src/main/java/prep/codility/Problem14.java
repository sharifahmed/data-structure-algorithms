package main.java.prep.codility;

import java.util.StringTokenizer;

/**
 * @author sharifahmed
 * @since 5/20/18
 * <p>
 * Longest Password in a String
 */
public class Problem14 {

    static class Solution {
        public int solution(String S) {
            if (S.length() == 0) {
                return 0;
            }

            StringTokenizer tokenizer = new StringTokenizer(S, " ");
            int max = -1;

            while (tokenizer.hasMoreTokens()) {
                String password = tokenizer.nextToken();
                if (isValidPassword(password) && password.length() > max) {
                    max = password.length();
                }
            }

            return max;
        }

        private boolean isValidPassword(String password) {
            int countDigits = 0;
            int countLetters = 0;

            for (int i = 0, len = password.length(); i < len; i++) {
                if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                    return false;
                } else if (Character.isDigit(password.charAt(i))) {
                    countDigits++;
                } else if (Character.isLetter(password.charAt(i))) {
                    countLetters++;
                }
            }

            return (countDigits % 2 == 1) && (countLetters % 2 == 0);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("test 5 a0A pass007 ?xy1"));
    }
}
