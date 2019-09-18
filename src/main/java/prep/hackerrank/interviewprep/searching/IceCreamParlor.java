package prep.hackerrank.interviewprep.searching;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 9/18/19
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        whatFlavors(new int[]{1, 4, 5, 3, 2}, 4);
        whatFlavors(new int[]{2, 2, 4, 3}, 4);
    }

    private static void whatFlavors(int[] cost, int money) {
        int[] sortedCost = cost.clone();
        Arrays.sort(sortedCost);

        int[] indices = new int[2];

        for (int i = 0; i < sortedCost.length; i++) {
            int remain = money - sortedCost[i];
            int loc = Arrays.binarySearch(sortedCost, i + 1, sortedCost.length, remain);

            if (loc >= 0 && loc < sortedCost.length && sortedCost[loc] == remain) {
                indices = findIndices(cost, sortedCost[i], remain);
                break;
            }
        }

        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] findIndices(int[] cost, int money, int remain) {
        int firstIndex = indexOf(cost, money, -1);
        int secondIndex = indexOf(cost, remain, firstIndex);

        return new int[]{Math.min(firstIndex, secondIndex) + 1, Math.max(firstIndex, secondIndex) + 1};
    }

    private static int indexOf(int[] cost, int val, int excludeThis) {
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] == val && i != excludeThis) {
                return i;
            }
        }
        return -1;
    }
}
