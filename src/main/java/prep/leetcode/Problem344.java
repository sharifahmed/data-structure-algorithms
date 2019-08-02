package main.java.prep.leetcode;

/**
 * @author sharifahmed
 * @since 5/19/18
 */
public class Problem344 {

    static class Solution {
        public String reverseString(String s) {
            if (s.length() == 0) {
                return s;
            }

            char[] ch = s.toCharArray();
            int len = ch.length;

            for (int i = 0, j = len - 1; i < j; i++, j--) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }

            return new String(ch);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseString("five"));
        System.out.println(new Solution().reverseString("hello"));
    }
}
