package main.java.prep.hackerrank;

/**
 * @author sharifahmed
 * @since 5/23/18
 */
public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int len = a.length;
        int diagA = 0, diagB = 0;

        for (int i = 0, j = 0; i < len && j < len; i++, j++) {
            diagA += a[i][j];
        }

        for (int i = len - 1, j = 0; i >= 0 && j < len; i--, j++) {
            diagB += a[i][j];
        }

        return Math.abs(diagA - diagB);
    }
}
