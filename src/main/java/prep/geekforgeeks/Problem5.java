package main.java.prep.geekforgeeks;

import java.util.*;

/**
 * @author sharifahmed
 * @since 5/18/18
 * <p>
 * First non-repeating character in a stream
 */
public class Problem5 {

    public static void main(String[] args) {
        String input = "aabc";
        System.out.println(findNonRepeatingChars(input));
    }

    private static List<String> findNonRepeatingChars(String input) {
        Queue<Character> queue = new LinkedList<>();
        Map<Character, Integer> countMap = new HashMap<>();
        List<String> output = new ArrayList<>();

        for (int i = 0, len = input.length(); i < len; i++) {
            char ch = input.charAt(i);

            countMap.put(ch, countMap.get(ch) == null ? 1 : countMap.get(ch) + 1);
            queue.add(ch);

            while (!queue.isEmpty()) {
                if (countMap.get(queue.peek()) > 1) {
                    queue.remove();
                } else {
                    output.add(queue.peek().toString());
                    break;
                }
            }

            if (queue.isEmpty()) {
                output.add("-1");
            }
        }

        return output;
    }
}
