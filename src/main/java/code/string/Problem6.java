package code.string;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 * Given two strings, write a function to check if they are one edit (or zero edits) away
 */
public class Problem6 {

    private static boolean oneEdit(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return oneReplace(s1, s2);
        } else if ((s1.length() + 1 == s2.length()) || s1.length() - 1 == s2.length()) {
            return oneInsertOrRemove(s1, s2);
        }

        return false;
    }

    private static boolean oneInsertOrRemove(String s1, String s2) {
        int index1 = 0, index2 = 0;

        while(index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }

                index1++;
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }

    private static boolean oneReplace(String s1, String s2) {
        boolean found = false;

        for (int i = 0, len = s1.length(); i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (found) {
                    return false;
                }
                found = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEdit("pale", "ple"));
        System.out.println(oneEdit("pales", "pale"));
        System.out.println(oneEdit("pale", "bale"));
        System.out.println(oneEdit("pale", "bale"));
        System.out.println(oneEdit("pale", "bae"));
    }
}
