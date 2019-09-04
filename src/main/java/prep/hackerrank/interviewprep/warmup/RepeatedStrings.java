package prep.hackerrank.interviewprep.warmup;

/**
 * @author sharifahmed
 * @since 9/4/19
 */
public class RepeatedStrings {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("a", 1000000000000L));
        System.out.println(repeatedString("aab", 882787));
        System.out.println(repeatedString("aaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 534802106762L));
    }

    static long repeatedString(String s, long n) {
        long noOfAs = s.chars().mapToObj(c -> (char) c).filter(c -> c == 'a').count();
        long dividend = n / s.length();
        long remainder = n % s.length();
        noOfAs *= dividend;
        noOfAs += s.substring(0, (int) remainder).chars().mapToObj(c -> (char) c).filter(c -> c == 'a').count();
        return noOfAs;
    }
}
