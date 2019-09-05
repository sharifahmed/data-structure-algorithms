package prep.hackerrank.interviewprep.string;

/**
 * @author sharifahmed
 * @since 9/5/19
 */
public class SpecialStringAgain {

    public static void main(String[] args) {
        System.out.println(substrCount(5, "asasd"));
        System.out.println(substrCount(8, "mnonopoo"));
        System.out.println(substrCount(7, "abcbaba"));
        System.out.println(substrCount(4, "aaaa"));
    }

    private static long substrCount(int n, String s) {
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (isSpecial(String.valueOf(s.charAt(i)))) {
                count++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for (int j = i + 1; j < n; j++) {
                sb.append(s.charAt(j));
                if (isSpecial(sb.toString())) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isSpecial(String str) {
        int len = str.length();
        if (len == 1) {
            return true;
        } else if (len % 2 != 0) {
            int mid = len / 2;
            String left = str.substring(0, mid);
            String right = str.substring(mid + 1, len);
            if (left.equals(right)) {
                return true;
            }
        } else if (len % 2 == 0) {
            if (str.chars().distinct().count() == 1) {
                return true;
            }
        }
        return false;
    }
}
