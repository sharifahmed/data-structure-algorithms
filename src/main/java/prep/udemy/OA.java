package main.java.prep.udemy;

/**
 * @author sharifahmed
 * @since 1/1/19
 */
public class OA {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(isOneAway("abcde", "abcd"));  // should return true
        System.out.println(isOneAway("abde", "abcde"));  // should return true
        System.out.println(isOneAway("a", "a"));  // should return true
        System.out.println(isOneAway("abcdef", "abqdef"));  // should return true
        System.out.println(isOneAway("abcdef", "abccef"));  // should return true
        System.out.println(isOneAway("abcdef", "abcde"));  // should return true
        System.out.println(isOneAway("aaa", "abc"));  // should return false
        System.out.println(isOneAway("abcde", "abc"));  // should return false
        System.out.println(isOneAway("abc", "abcde"));  // should return false
        System.out.println(isOneAway("abc", "bcc"));  // should return false
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        if (s1.length() == s2.length()) {
            int changesNeeded = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    changesNeeded++;
                    if (changesNeeded > 1) {
                        return false;
                    }
                }
            }
            return true;
        }

        int i = 0, j = 0, changesNeeded = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++; j++;
            } else {
                if (s1.length() > s2.length()) {
                    if (s1.charAt(i+1) != s2.charAt(j)) {
                        return false;
                    } else {
                        i += 2;
                        j++;
                        changesNeeded++;
                    }
                } else {
                    if (s1.charAt(i) != s2.charAt(j+1)) {
                        return false;
                    } else {
                        i++;
                        j += 2;
                        changesNeeded++;
                    }
                }
            }

            if (changesNeeded > 1) {
                return false;
            }
        }

        return true;
    }
}
