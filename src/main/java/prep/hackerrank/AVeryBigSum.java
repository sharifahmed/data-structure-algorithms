package main.java.prep.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long total = 0;

        for (long anAr : ar) {
            total += anAr;
        }

        return total;
    }
}
