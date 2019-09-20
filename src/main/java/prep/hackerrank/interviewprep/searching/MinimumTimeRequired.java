package prep.hackerrank.interviewprep.searching;

import java.util.stream.LongStream;

/**
 * @author sharifahmed
 * @since 2019-09-21
 */
public class MinimumTimeRequired {

    public static void main(String[] args) {
        System.out.println(minTime(new long[]{2, 3}, 5));
        System.out.println(minTime(new long[]{1, 3, 4}, 10));
        System.out.println(minTime(new long[]{4, 5, 6}, 12));
        System.out.println(minTime(new long[]{2, 3, 2}, 10));
    }

    static long minTime(long[] machines, long goal) {
        long left = 0;
        long right = LongStream.of(machines).min().getAsLong() * goal;
        long result = -1;

        while (left < right) {
            long mid = (left + ((right - left) / 2));
            long noOfProduce = findNoOfProduce(machines, mid);
            if (noOfProduce < goal) {
                left = mid + 1;
            } else {
                right = mid;
                result = mid;
            }
        }

        return result;
    }

    private static long findNoOfProduce(long[] machines, long noOfDays) {
        long noOfProduce = 0;

        for (long machine : machines) {
            noOfProduce += noOfDays / machine;
        }

        return noOfProduce;
    }
}
