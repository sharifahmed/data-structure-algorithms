package main.java.prep.udemy;

/**
 * @author sharifahmed
 * @since 1/6/19
 */
public class MS {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        mineSweeper(bombs1, 3, 3);

        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        mineSweeper(bombs2, 3, 4);
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        mineSweeper(bombs3, 5, 5);
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];

        int noOfBombs = bombs.length;
        for (int i = 0; i < noOfBombs; i++) {
            field[bombs[i][0]][bombs[i][1]] = -1;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (field[i][j] == -1) {
                    continue;
                }

                if (j+1 < numCols && field[i][j+1] == -1) {
                    field[i][j] += 1;
                }
                if (i+1 < numRows && j+1 < numCols && field[i+1][j+1] == -1) {
                    field[i][j] += 1;
                }
                if (i-1 >= 0 && j+1 < numCols && field[i-1][j+1] == -1) {
                    field[i][j] += 1;
                }

                if (i-1 >= 0 && field[i-1][j] == -1) {
                    field[i][j] += 1;
                }
                if (i+1 < numRows && field[i+1][j] == -1) {
                    field[i][j] += 1;
                }

                if (j-1 >= 0 && field[i][j-1] == -1) {
                    field[i][j] += 1;
                }
                if (i-1 >= 0 && j-1 >= 0 && field[i-1][j-1] == -1) {
                    field[i][j] += 1;
                }
                if (i+1 < numRows && j-1 >= 0 && field[i+1][j-1] == -1) {
                    field[i][j] += 1;
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

        return field;
    }
}
