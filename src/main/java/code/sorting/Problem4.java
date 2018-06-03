package code.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sharifahmed
 * @since 5/12/18
 * <p>
 * Write a method to sort an array of strings so that all the anagrams are next to each other
 */
public class Problem4 {

    private static class AnagramComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return sortChars(o1).compareTo(sortChars(o2));
        }
    }

    public static void main(String[] args) {
        String[] input = new String[]{"acre", "race", "abc", "care", "bca"};

        Arrays.sort(input, new AnagramComparator());

        Arrays.stream(input).forEach(System.out::println);
    }

    private static String sortChars(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
