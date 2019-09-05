package prep.codewars;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 9/5/19
 */
public class TheHighestProfitWins {

    public static void main(String[] args) {
        System.out.println(minMax(new int[]{1, 2, 3, 4, 5}));
        System.out.println(minMax(new int[]{2334454, 5}));
        System.out.println(minMax(new int[]{1}));
    }

    public static int[] minMax(int[] arr) {
        if (arr.length == 1) {
            return new int[]{arr[0], arr[0]};
        }
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}
