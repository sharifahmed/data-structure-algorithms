package main.java.prep.string;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 4/25/18
 *
 * Given two strings, write a method to decide if one is a permutation of the other
 */
public class Problem3 {

    private static String sort(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }

    private static boolean method1(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

    private static boolean method2(String s1, String s2) {
        int[] count = new int[256];

        for (int i = 0, len = s1.length(); i < len; i++) {
            count[s1.charAt(i)]++;
        }

        for (int i = 0, len = s2.length(); i < len; i++) {
            if (count[s2.charAt(i)] == 0) {
                return false;
            }
            count[s2.charAt(i)]--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(method1("aabcd", "bacad"));
        System.out.println(method2("aabcd", "bacad"));

        System.out.println(method2("aabcd", "bacaad"));
        System.out.println(method2("aabcd", "bacada"));
    }
}
