package main.java.prep.leetcode;

/**
 * @author sharifahmed
 * @since 5/3/18
 */
public class Problem7 {

    public static int reverse(int x) {
        long result = 0;
        long input = x;

        while (input != 0) {
            result = (result * 10) + (input % 10);
            input /= 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
