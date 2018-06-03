package code.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class PlusMinus {

    static void plusMinus(int[] arr) {
        int len = arr.length;
        float pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            }
        }

        System.out.printf("%.6f", pos / len);
        System.out.println();
        System.out.printf("%.6f", neg / len);
        System.out.println();
        System.out.printf("%.6f", zero / len);
    }

    public static void main(String[] args) {
        plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
    }
}
