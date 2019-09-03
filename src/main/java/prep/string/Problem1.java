package main.java.prep.string;

/**
 * @author sharifahmed
 * @since 4/25/18
 *
 * Implement an algorithm to determine if a string has all unique characters
 */
public class Problem1 {

    private static boolean isUnique(String input) {
        if (input == null || input.length() > 256) {
            return false;
        }

        boolean[] flag = new boolean[256];
        int length = input.length();

        for (int index = 0; index < length; index++) {
            int ascii = input.charAt(index);
            if (flag[ascii]) {
                return false;
            }
            flag[ascii] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "";
        System.out.println(isUnique(input));
    }
}
