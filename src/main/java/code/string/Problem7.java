package code.string;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 *  Implement a method to perform basic string compression using the counts of repeated characters
 */
public class Problem7 {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println(compress(input));
    }

    private static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int repeatCount = 1;

        for (int index = 0, len = input.length(); index < len; index++) {
            if (index + 1 >= len || input.charAt(index) != input.charAt(index + 1)) {
                sb.append(input.charAt(index)).append(String.valueOf(repeatCount));
                repeatCount = 1;

            } else {
                repeatCount++;
            }
        }

        return sb.toString();
    }
}
