package code.string;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 * Given a string, write a function to check if it is a permutation of a palindrome.
 */
public class Problem5 {

    private static final int a = Character.getNumericValue('a');
    private static final int z = Character.getNumericValue('z');

    private static int getCharacterNumber(char ch) {
        int c = Character.getNumericValue(ch);
        return (c >= a && c <= z) ? (c - a) : -1;
    }

    private static int[] buildCountTable(String input) {
        int[] countTable = new int[z - (a +1)];

        for (char c : input.toCharArray()) {
            int num = getCharacterNumber(c);
            if (num != -1) {
                countTable[num]++;
            }
        }

        return countTable;
    }

    private static boolean isPermPalindrome(String input) {
        int[] countTable = buildCountTable(input);
        boolean foundOdd = false;

        for (int count : countTable) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "Tact Coab";

        System.out.println(isPermPalindrome(input));
    }
}
