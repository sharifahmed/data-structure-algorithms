package prep.hackerrank.interviewprep.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author sharifahmed
 * @since 2019-09-22
 */
public class LuckBalance {

    private static final int IMPORTANT = 1;

    public static void main(String[] args) {
        int[][] contests = new int[][]{
                {5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}
        };
        System.out.println(luckBalance(3, contests));
    }

    private static int luckBalance(int k, int[][] contests) {
        List<Integer> important = new ArrayList<>();
        List<Integer> unImportant = new ArrayList<>();

        for (int[] contest : contests) {
            if (contest[1] == IMPORTANT) {
                important.add(contest[0]);
            } else {
                unImportant.add(contest[0]);
            }
        }

        important.sort(Comparator.reverseOrder());

        int luckBalance = 0;

        for (Integer imp : important) {
            if (k > 0) {
                luckBalance += imp; //loose
                k--;
            } else {
                luckBalance -= imp; //win
            }
        }

        for (Integer unImp : unImportant) {
            luckBalance += unImp;
        }

        return luckBalance;
    }
}
