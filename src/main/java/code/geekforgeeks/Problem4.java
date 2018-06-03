package code.geekforgeeks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sharifahmed
 * @since 5/18/18
 * <p>
 * Rotten Oranges
 */
public class Problem4 {

    public static void main(String[] args) {
        int row = 3, col = 5;
        int[][] container = new int[][]{
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}
        };

        System.out.println(minTimeToRotAll(container, row, col));
    }

    private static class Node {
        int x;
        int y;

        private Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int minTimeToRotAll(int[][] container, int row, int col) {
        int ROTTEN = 2, FRESH = 1;
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (container[i][j] == ROTTEN) {
                    queue.add(new Node(i, j));
                }
            }
        }

        queue.add(new Node(-1, -1));
        int timeFrame = 0;

        while (!queue.isEmpty()) {
            boolean timeLogged = false;

            while (!isDelimiterReached(queue.peek())) {
                Node node = queue.peek();

                if (isValid(node.x - 1, node.y, row, col) && container[node.x - 1][node.y] == FRESH) {
                    container[node.x - 1][node.y] = ROTTEN;
                    queue.add(new Node(node.x - 1, node.y));
                    if (!timeLogged) {
                        timeFrame++;
                        timeLogged = true;
                    }
                }
                if (isValid(node.x + 1, node.y, row, col) && container[node.x + 1][node.y] == FRESH) {
                    container[node.x + 1][node.y] = ROTTEN;
                    queue.add(new Node(node.x + 1, node.y));
                    if (!timeLogged) {
                        timeFrame++;
                        timeLogged = true;
                    }
                }
                if (isValid(node.x, node.y - 1, row, col) && container[node.x][node.y - 1] == FRESH) {
                    container[node.x][node.y - 1] = ROTTEN;
                    queue.add(new Node(node.x, node.y - 1));
                    if (!timeLogged) {
                        timeFrame++;
                        timeLogged = true;
                    }
                }
                if (isValid(node.x, node.y + 1, row, col) && container[node.x][node.y + 1] == FRESH) {
                    container[node.x][node.y + 1] = ROTTEN;
                    queue.add(new Node(node.x, node.y + 1));
                    if (!timeLogged) {
                        timeFrame++;
                        timeLogged = true;
                    }
                }

                queue.remove();
            }

            queue.remove();

            if (!queue.isEmpty()) {
                queue.add(new Node(-1, -1));
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (container[i][j] == FRESH) {
                    return -1;
                }
            }
        }

        return timeFrame;
    }

    private static boolean isValid(int x, int y, int row, int col) {
        return (x >= 0 && x < row) && (y >= 0 && y < col);
    }

    private static boolean isDelimiterReached(Node peek) {
        return peek.x == -1 && peek.y == -1;
    }
}
