package main.java.prep.udemy;

import java.util.Stack;

/**
 * @author sharifahmed
 * @since 1/7/19
 */
public class MS2 {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] field1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, -1, 1, 0}};

        click(field1, 3, 5, 2, 2);
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]

        click(field1, 3, 5, 1, 4);
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]

        int[][] field2 = {{-1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, -1}};

        click(field2, 4, 4, 0, 1);
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]

        click(field2, 4, 4, 1, 3);
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
    }

    // Implement your solution below.
    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
        if (field[givenI][givenJ] == -1 || field[givenI][givenJ] != 0) {
            return field;
        }

        Stack<Coordinate> stack = new Stack<>();
        stack.push(new Coordinate(givenI, givenJ));
        field[givenI][givenJ] = -2;

        while(!stack.isEmpty()) {
            Coordinate coordinate = stack.pop();
            int i = coordinate.x;
            int j = coordinate.y;

            if (j+1 < numCols && field[i][j+1] == 0) {
                field[i][j+1] = -2;
                stack.push(new Coordinate(i, j+1));
            }
            if (i+1 < numRows && j+1 < numCols && field[i+1][j+1] == 0) {
                field[i+1][j+1] = -2;
                stack.push(new Coordinate(i+1, j+1));
            }
            if (i-1 >= 0 && j+1 < numCols && field[i-1][j+1] == 0) {
                field[i-1][j+1] = -2;
                stack.push(new Coordinate(i-1, j+1));
            }

            if (i-1 >= 0 && field[i-1][j] == 0) {
                field[i-1][j] = -2;
                stack.push(new Coordinate(i-1, j));
            }
            if (i+1 < numRows && field[i+1][j] == 0) {
                field[i+1][j] = -2;
                stack.push(new Coordinate(i+1, j));
            }

            if (j-1 >= 0 && field[i][j-1] == 0) {
                field[i][j-1] = -2;
                stack.push(new Coordinate(i, j-1));
            }
            if (i-1 >= 0 && j-1 >= 0 && field[i-1][j-1] == 0) {
                field[i-1][j-1] = -2;
                stack.push(new Coordinate(i-1, j-1));
            }
            if (i+1 < numRows && j-1 >= 0 && field[i+1][j-1] == 0) {
                field[i+1][j-1] = -2;
                stack.push(new Coordinate(i+1, j-1));
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

    public static class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
