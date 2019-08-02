package main.java.prep.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        if (ar.length == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0, len = ar.length; i < len; i++) {
            total += ar[i];
        }

        return total;
    }

}
