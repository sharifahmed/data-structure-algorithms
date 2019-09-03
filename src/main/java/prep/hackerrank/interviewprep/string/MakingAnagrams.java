package main.java.prep.hackerrank.interviewprep.string;

/**
 * @author sharifahmed
 * @since 8/7/19
 */
public class MakingAnagrams {

    private static final int LEN = 26;

    public static void main(String[] args) {
        System.out.println(makeAnagram("cde", "abc"));
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

    static int makeAnagram(String a, String b) {
        int count = 0;

        int[] countA = getCharacterCount(a);
        int[] countB = getCharacterCount(b);

        for (int i = 0; i<LEN;i++) {
            count += Math.abs(countA[i] - countB[i]);
        }

        return count;
    }

    private static int[] getCharacterCount(String str) {
        int[] count = new int[LEN];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            count[index]++;
        }

        return count;
    }
}
