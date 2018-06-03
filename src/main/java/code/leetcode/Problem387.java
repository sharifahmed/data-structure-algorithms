package code.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 5/19/18
 */
public class Problem387 {

    static class Solution {
        public int firstUniqueChar(String s) {
            Map<Character, Integer> countMap = new LinkedHashMap<>();

            for (int i = 0, len = s.length(); i < len; i++) {
                char ch = s.charAt(i);
                countMap.put(ch, countMap.get(ch) == null ? 1 : countMap.get(ch) + 1);
            }

            for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return s.indexOf(entry.getKey());
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqueChar("loveleetcode"));
        System.out.println(new Solution().firstUniqueChar("leetcode"));
    }
}
