package code.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem7 {

    static class Solution {

        public int solution(int[] A) {
            Map<Integer, Integer> countMap = new HashMap<>();
            int threshold = A.length / 2;

            for (int i = 0, len = A.length; i < len; i++) {
                Integer count = countMap.get(A[i]);

                if (count != null) {
                    countMap.put(A[i], ++count);
                } else {
                    countMap.put(A[i], 1);
                }
            }

            int maxValue = -1;
            int maxKey = -1;

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            if (maxValue > threshold) {

                for (int i = 0, len = A.length; i < len; i++) {
                    if (maxKey == A[i]) {
                        return i;
                    }
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3,4,3,2,3,-1,3,3}));
    }
}
