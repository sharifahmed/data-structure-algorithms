package main.java.prep.hackerrank.interviewprep.sorting;

import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 8/6/19
 */
public class MarkandToys {

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }

    static int maximumToys(int[] prices, int k) {
        prices = IntStream.of(prices).sorted().toArray();

        int count = 0;
        for (Integer i : prices) {
            if (k == 0 || k < i) {
                break;
            }
            k -= i;
            count++;
        }

        return count;
    }
}
