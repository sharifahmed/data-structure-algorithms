package prep.hackerrank.interviewprep.string;

/**
 * @author sharifahmed
 * @since 9/5/19
 */
public class AlternatingCharacter {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
    }

    static int alternatingCharacters(String s) {
        int noOfDeletions = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                noOfDeletions++;
            }
        }

        return noOfDeletions;
    }
}
