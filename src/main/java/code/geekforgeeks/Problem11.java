package code.geekforgeeks;

/**
 * @author sharifahmed
 * @since 5/19/18
 * <p>
 * Longest Common Substring
 */
public class Problem11 {

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("aba", "ba"));
        System.out.println(longestCommonSubstring("GeeksforGeeks", "GeeksQuiz"));
        System.out.println(longestCommonSubstring("abcdxyz", "xyzabcd"));
        System.out.println(longestCommonSubstring("zxabcdezy", "yzabcdezx"));
    }

    private static String longestCommonSubstring(String input1, String input2) {
        String output = "";

        if (input1.length() == 0 || input2.length() == 0) {
            return output;
        }

        int[][] cache = new int[input1.length()][input2.length()];

        for (int i = 0, len1 = input1.length(); i < len1; i++) {
            for (int j = 0, len2 = input2.length(); j < len2; j++) {
                if (input1.charAt(i) == input2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        cache[i][j] = 1;
                    } else {
                        cache[i][j] = cache[i - 1][j - 1] + 1;
                    }
                    if (cache[i][j] > output.length()) {
                        output = input1.substring(i - cache[i][j] + 1, i + 1);
                    }
                }
            }
        }

        return output;
    }
}
