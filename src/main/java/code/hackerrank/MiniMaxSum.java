package code.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            long total = 0;

            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    total += arr[j];
                }
            }

            if (total > max) {
                max = total;
            } else if (total < min) {
                min = total;
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{1, 2, 3, 4, 5});
        miniMaxSum(new int[]{769082435, 210437958, 673982045, 375809214, 380564127});
    }
}
