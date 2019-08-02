package main.java.prep.geekforgeeks;

/**
 * @author sharifahmed
 * @since 5/19/18
 *
 * Atoi
 */
public class Problem10 {

    public static void main(String[] args) {
        String input = "123a";
        System.out.println(atoi(input));
    }

    private static int atoi(String input) {
        int result = 0;

        for (int i = 0, len = input.length(); i < len; i++) {
            int num = Character.getNumericValue(input.charAt(i));

            if (num >= 0 && num <= 9) {
                result = (result * 10) + num;
            } else {
                return -1;
            }
        }

        return result;
    }
}
