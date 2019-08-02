package main.java.prep.leetcode;

/**
 * @author sharifahmed
 * @since 5/4/18
 */
public class Problem28 {

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        int index = -1;
        int needlePointer = 0;

        for (int i = 0, len = haystack.length(); i < len; i++) {
            if (needle.charAt(needlePointer) == haystack.charAt(i)) {
                index = i;

                if (needle.length() == 1) {
                    return index;
                }

                needlePointer++;

                for (int j = i + 1; j < len; j++) {
                    if (needle.charAt(needlePointer) == haystack.charAt(j)) {
                        needlePointer++;

                        if (needlePointer == needle.length()) {
                            return index;
                        }
                    } else {
                        needlePointer = 0;
                        i = index;
                        break;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hellolll", "ll"));
    }
}
