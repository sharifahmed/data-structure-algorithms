package prep.hackerrank.interviewprep.hashmap;

import java.util.*;

/**
 * @author sharifahmed
 * @since 9/4/19
 */
public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("a", "a"));
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("wouldyoulikefries", "abcabcabcabcabcabc"));
        System.out.println(twoStrings("hackerrankcommunity", "cdecdecdecde"));
        System.out.println(twoStrings("writetoyourparents", "fghmqzldbc"));
    }

    static String twoStrings(String s1, String s2) {
        Map<Character, Integer> countMap1 = getUniqueCharacters(s1);
        Map<Character, Integer> countMap2 = getUniqueCharacters(s2);

        for (Map.Entry<Character, Integer> entry : countMap1.entrySet()) {
            if (countMap2.get(entry.getKey()) != null) {
                return "YES";
            }
        }
        return "NO";
    }

    static Map<Character, Integer> getUniqueCharacters(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (countMap.get(ch) == null) {
                countMap.put(ch, 1);
            }
        }
        return countMap;
    }
}
