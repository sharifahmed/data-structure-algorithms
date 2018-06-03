package code.string;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 *  Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one call to isSubstring
 */
public class Problem8 {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println(isOneRotation(s1, s2));
    }

    private static boolean isOneRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String con = s1 + s1;
        return con.contains(s2);
    }
}
