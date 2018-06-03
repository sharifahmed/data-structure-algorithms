package code.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 5/15/18
 */
public class Problem13 {

    static class Solution {

        public int solution(int[] A) {
            int MAX = 10000000;
            int len = A.length;
            int total = 0;

            List<Disc> discList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                discList.add(new Disc(A[i], i + A[i], i - A[i]));
            }

            for (int j = 0; j < len; j++) {
                Disc first = discList.get(j);

                for (int k = j + 1; k < len; k++) {
                    Disc second = discList.get(k);

                    if ((isBetween(second.rightMostPoint, first.leftMostPoint, first.rightMostPoint) && isBetween(second.leftMostPoint, first.leftMostPoint, first.rightMostPoint)) ||
                            (isBetween(second.rightMostPoint, first.leftMostPoint, first.rightMostPoint) && second.leftMostPoint <= first.leftMostPoint) ||
                            (isBetween(second.leftMostPoint, first.leftMostPoint, first.rightMostPoint) && second.rightMostPoint >= first.rightMostPoint) ||
                            (second.rightMostPoint == first.leftMostPoint || second.leftMostPoint == first.rightMostPoint)) {
                        total++;
                    }
                    if (total > MAX) {
                        return -1;
                    }
                }
            }

            return total;
        }
    }

    static class Disc {
        int center;
        int rightMostPoint;
        int leftMostPoint;

        Disc(int center, int rightMostPoint, int leftMostPoint) {
            this.center = center;
            this.rightMostPoint = rightMostPoint;
            this.leftMostPoint = leftMostPoint;
        }
    }

        static boolean isBetween(int val, int start, int end) {
            return val >= start && val <= end;
        }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 5, 2, 1, 4, 0}));
        System.out.println(new Solution().solution(new int[]{1, 0, 1, 0, 1}));
    }
}
