package main.java.prep.string;

/**
 * @author sharifahmed
 * @since 4/25/18
 *
 * Implement an algorithm to determine if a string has all unique characters, without using additional array
 */
public class Problem2 {

    private static boolean isUnique(String input) {
        if (input == null) {
            return false;
        }

        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "Sharif Amed";
        System.out.println(isUnique(input));
    }
}
