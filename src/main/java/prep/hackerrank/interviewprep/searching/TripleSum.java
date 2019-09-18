package prep.hackerrank.interviewprep.searching;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 9/18/19
 */
public class TripleSum {

    public static void main(String[] args) {
        System.out.println(triplets(new int[]{3, 5, 7}, new int[]{3, 6}, new int[]{4, 6, 9}));
        System.out.println(triplets(new int[]{1, 3, 5}, new int[]{2, 3}, new int[]{1, 2, 3}));
        System.out.println(triplets(new int[]{1, 4, 5}, new int[]{2, 3, 3}, new int[]{1, 2, 3}));
        System.out.println(triplets(new int[]{1, 3, 5, 7}, new int[]{5, 7, 9}, new int[]{7, 9, 11, 12}));
    }

    static long triplets(int[] a, int[] b, int[] c) {
        long triplets = 0;

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        a = IntStream.of(a).distinct().toArray();
        b = IntStream.of(b).distinct().toArray();
        c = IntStream.of(c).distinct().toArray();

        for (int elem : b) {
            long lenA = linearSearch(a, elem);
            long lenC = linearSearch(c, elem);
            triplets += lenA * lenC;
        }

        return triplets;
    }

    private static long linearSearch(int[] a, int elem) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > elem) {
                return i;
            }
        }
        return a.length;
    }
}
