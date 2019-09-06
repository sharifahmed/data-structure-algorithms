package prep.hackerrank.interviewprep.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 9/6/19
 */
public class NewYearChaos {

    public static void main(String[] args) {
        minimumBribes(new int[]{2, 1, 5, 3, 4});
        minimumBribes(new int[]{2, 5, 1, 3, 4});
        minimumBribes(new int[]{5, 1, 2, 3, 7, 8, 6, 4});
        minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }

    private static void minimumBribes(int[] q) {
        int len = q.length;
        List<Integer> a = new ArrayList<>();
        int noOfSwaps = 0;

        for (int i = 0; i < len; i++) {
            a.add(i + 1);
        }

        for (int i = 0; i < len; i++) {
            int finalPos = i;
            int currentPos = a.indexOf(q[i]);
            if (currentPos == finalPos) {
                continue;
            }
            if (currentPos - finalPos > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                int j = currentPos;
                while (j > finalPos) {
                    int temp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j - 1, temp);
                    noOfSwaps++;
                    j--;
                }
            }
        }
        System.out.println(noOfSwaps);
    }
}
