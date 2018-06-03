package code.matrix;

/**
 * @author sharifahmed
 * @since 4/28/18
 */
public class Problem1 {

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = count++;
            }
        }

        print(matrix, n);
        rotate90Degree(matrix, n);
        print(matrix, n);
    }

    private static void rotate90Degree(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                //bottom-left to top-left
                matrix[first][i] = matrix[last - offset][first];

                //bottom-right to bottom-left
                matrix[last - offset][i] = matrix[last - offset][last - offset];

                //top-right to bottom-right
                matrix[last - offset][last - offset] = matrix[last - offset][i];

                //top-left to top-right
                matrix[last - offset][i] = top;
            }
        }
    }

    private static void print(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
