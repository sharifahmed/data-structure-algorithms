package code.string;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 * Write a method to replace all spaces in a string with '%20'
 */
public class Problem4 {

    private static String replace(String s, int trueLen) {
        char[] charArray = s.toCharArray();

        int spaceCount = 0;

        for (char c : charArray) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        int index = (trueLen - 1) + (spaceCount - 1);

        for (int i = trueLen - 1; i > 0; i--) {
            if (charArray[i] == ' ') {
                charArray[index - 3] = '%';
                charArray[index - 2] = '2';
                charArray[index - 1] = '0';

                index -= 3;

            } else {
                charArray[index - 1] = charArray[i];
                index--;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        int trueLen = 13;

        System.out.println(replace(input, trueLen));
    }
}
