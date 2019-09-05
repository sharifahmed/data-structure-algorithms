package prep.hackerrank.interviewprep.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author sharifahmed
 * @since 9/5/19
 */
public class SherlockAndTheValidString {

    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("abc"));
        System.out.println(isValid("aabbccc"));
        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("abcdefghhgfedecba"));
        System.out.println(isValid("aabbc"));
        System.out.println(isValid("abbccc"));
    }

    private static String isValid(String s) {
        if (s.length() == 1 || s.length() == 2) {
            return "YES";
        }

        Map<Character, Integer> countMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (Objects.isNull(countMap.get(ch))) {
                countMap.put(ch, 1);
            } else {
                countMap.put(ch, countMap.get(ch) + 1);
            }
        }

        List<Integer> countList = countMap.values().stream().sorted().collect(Collectors.toList());
        int min = countList.get(0);

        boolean alreadyRemoved = false;

        if (min == 1) {
            countList.remove(0);
            min = countList.get(0);
            alreadyRemoved = true;
        }

        for (Integer count : countList) {
            if (count > min) {
                if (alreadyRemoved) {
                    return "NO";
                }
                if (count - 1 != min) {
                    return "NO";
                }
                alreadyRemoved = true;
            }
        }

        return "YES";
    }
}
