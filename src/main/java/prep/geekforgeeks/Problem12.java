package main.java.prep.geekforgeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 5/19/18
 * <p>
 * Permutations of a string
 */
public class Problem12 {

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = new ArrayList<>();
        permutations("", input, result);
        System.out.println(result);
    }

    private static void permutations(String prefix, String suffix, List<String> result) {
        if (suffix.length() == 0) {
            result.add(prefix);
            return;
        }

        for (int i = 0, len = suffix.length(); i < len; i++) {
            System.out.println(prefix + suffix.charAt(i) + " - " + suffix.substring(0, i) + suffix.substring(i + 1, len));
            permutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, len), result);
        }
    }
}
