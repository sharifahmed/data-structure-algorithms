package prep.hackerrank.interviewprep.searching;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 9/18/19
 */
public class Pair {

    public static void main(String[] args) {
        System.out.println(pairs(2, new int[]{1, 5, 3, 4, 2}));
        System.out.println(pairs(1, new int[]{1, 2, 3, 4}));
    }

    static int pairs(int k, int[] arr) {
        int noOfPairs = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int remain = k + arr[i];
            int loc = Arrays.binarySearch(arr, i + 1, arr.length, remain);
            if (loc >= 0 && loc < arr.length && arr[loc] == remain) {
                noOfPairs++;
            }
        }

        return noOfPairs;
    }
}
