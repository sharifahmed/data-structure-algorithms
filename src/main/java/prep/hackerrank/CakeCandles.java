package main.java.prep.hackerrank;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class CakeCandles {

    static int cakeCandles(int[] ar) {
        Arrays.sort(ar);

        int num = 1;
        int max = ar[ar.length - 1];

        for (int i = ar.length - 2; i >= 0; i--) {
            if (ar[i] == max) {
                num++;
            } else {
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(cakeCandles(new int[]{1, 0, 1, 1}));
    }
}
