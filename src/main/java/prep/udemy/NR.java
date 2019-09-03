package main.java.prep.udemy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 1/1/19
 */
public class NR {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("aabbdbc")); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        Map<Character, Integer> count = new LinkedHashMap<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (count.get(s.charAt(i)) == null) {
                count.put(s.charAt(i), 1);
            } else {
                int c = count.get(s.charAt(i));
                count.put(s.charAt(i), ++c);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
