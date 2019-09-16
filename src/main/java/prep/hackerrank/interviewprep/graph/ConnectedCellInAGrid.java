package prep.hackerrank.interviewprep.graph;

/**
 * @author sharifahmed
 * @since 9/16/19
 */
public class ConnectedCellInAGrid {

    static int maxRegion(int[][] grid) {
        int maxRegionSize = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    int size = getRegionSize(grid, row, col);
                    maxRegionSize = Math.max(maxRegionSize, size);
                }
            }
        }

        return maxRegionSize;
    }

    private static int getRegionSize(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length) {
            return 0;
        }
        if (grid[row][col] == 0) {
            return 0;
        }
        grid[row][col] = 0;
        int size = 1;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r == row && c == col) {
                    continue;
                }
                size += getRegionSize(grid, r, c);
            }
        }

        return size;
    }

    public static void main(String[] args) {
        int[][] grid = new int[4][4];

        grid[0][0] = 1;
        grid[0][1] = 1;
        grid[0][2] = 0;
        grid[0][3] = 0;

        grid[1][0] = 0;
        grid[1][1] = 1;
        grid[1][2] = 1;
        grid[1][3] = 0;

        grid[2][0] = 0;
        grid[2][1] = 0;
        grid[2][2] = 1;
        grid[2][3] = 0;

        grid[3][0] = 1;
        grid[3][1] = 0;
        grid[3][2] = 0;
        grid[3][3] = 0;

        System.out.println(maxRegion(grid));
    }
}
