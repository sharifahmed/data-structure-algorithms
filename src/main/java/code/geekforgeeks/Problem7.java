package code.geekforgeeks;

/**
 * @author sharifahmed
 * @since 5/19/18
 * <p>
 * Reverse words in a given string
 */
public class Problem7 {

    public static void main(String[] args) {
        String input = "I love programming very much";
        System.out.println(reverse(input));
    }

    private static String reverse(String input) {
        int len = input.length();
        int start = len - 1;
        int end = len - 1;

        StringBuilder builder = new StringBuilder();

        while (start > 0) {
            if (input.charAt(start) == ' ') {
                builder.append(input.substring(start + 1, end + 1)).append(" ");
                start--;
                end = start;
            } else {
                start--;
            }
        }

        if (start == 0) {
            builder.append(input.substring(start, end + 1));
        }

        return builder.toString();
    }
}
