package main.java.prep.geekforgeeks;

import java.util.LinkedHashSet;

/**
 * @author sharifahmed
 * @since 5/19/18
 * <p>
 * Remove Duplicates from string
 */
public class Problem8 {

    public static void main(String[] args) {
        String input1 = "geeksforgeeks";
        String input2 = "geeks for geeks";

        System.out.println(removeDuplicates(input1));
        System.out.println(removeDuplicates(input2));
    }

    private static String removeDuplicates(String input) {
        int len = input.length();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < len; i++) {
            set.add(input.charAt(i));
        }

        StringBuilder builder = new StringBuilder();
        for(Character s : set) {
            builder.append(s);
        }

        return builder.toString();
    }
}
