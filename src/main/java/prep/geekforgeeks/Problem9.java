package main.java.prep.geekforgeeks;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/19/18
 *
 * Anagram
 */
public class Problem9 {

    public static void main(String[] args) {
        String input1 = "allergy", input2 = "allergic";
        System.out.println(isAnagram(input1, input2));
    }

    private static boolean isAnagram(String input1, String input2) {
        char[] ch1 = input1.toCharArray();
        char[] ch2 = input2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return new String(ch1).equals(new String(ch2));
    }
}
