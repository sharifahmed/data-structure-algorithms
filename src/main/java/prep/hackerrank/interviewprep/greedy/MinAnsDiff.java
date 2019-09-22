package prep.hackerrank.interviewprep.greedy;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 2019-09-22
 */
public class MinAnsDiff {

    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(new int[]{3, -7, 0}));
    }

    static int minimumAbsoluteDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            minDiff = Math.min(diff, minDiff);
        }

        return minDiff;
    }
}