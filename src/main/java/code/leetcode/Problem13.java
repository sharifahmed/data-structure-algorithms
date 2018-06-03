package code.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 5/3/18
 */
public class Problem13 {

    static Map<Character, Integer> numeralMap = new HashMap<>();

    static {
        numeralMap.put('I', 1);
        numeralMap.put('V', 5);
        numeralMap.put('X', 10);
        numeralMap.put('L', 50);
        numeralMap.put('C', 100);
        numeralMap.put('D', 500);
        numeralMap.put('M', 1000);

        numeralMap = Collections.unmodifiableMap(numeralMap);
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == 'I' && i + 1 < len && s.charAt(i + 1) == 'V') {
                result += 4;
                i++;
            } else if (s.charAt(i) == 'I' && i + 1 < len && s.charAt(i + 1) == 'X') {
                result += 9;
                i++;

            } else if (s.charAt(i) == 'X' && i + 1 < len && s.charAt(i + 1) == 'L') {
                result += 40;
                i++;

            } else if (s.charAt(i) == 'X' && i + 1 < len && s.charAt(i + 1) == 'C') {
                result += 90;
                i++;

            } else if (s.charAt(i) == 'C' && i + 1 < len && s.charAt(i + 1) == 'D') {
                result += 400;
                i++;

            } else if (s.charAt(i) == 'C' && i + 1 < len && s.charAt(i + 1) == 'M') {
                result += 900;
                i++;

            } else {
                result += numeralMap.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
