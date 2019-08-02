package main.java.prep.hackerrank.interviewprep.warmup;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 8/2/19
 */
public class SockMerchant {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, arr));
    }

    static int sockMerchant(int n, int[] ar) {
        if (n == 1) {
            return 0;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (countMap.get(ar[i]) == null) {
                countMap.put(ar[i], 1);
            } else {
                countMap.put(ar[i], countMap.get(ar[i]) + 1);
            }
        }

        int num = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                num += (entry.getValue() - 1) / 2;
            } else {
                num += entry.getValue() / 2;
            }
        }

        return num;
    }
}
