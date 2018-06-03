package code.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class Staircase {

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
