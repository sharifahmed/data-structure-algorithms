package main.java.prep.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class ComparetheTriplets {

    static int[] solve(int[] a, int[] b) {
        int totalA = 0, totalB = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                totalA++;
            } else if (a[i] < b[i]) {
                totalB++;
            }
        }

        return new int[]{totalA, totalB};
    }
}
