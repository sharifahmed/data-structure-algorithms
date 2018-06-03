package code.matrix;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0
 */
public class Problem2 {

    private static class Node {

        private int value;
        private boolean zeroByUs;

        private Node() {
            this.zeroByUs = false;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setZeroByUs(boolean zeroByUs) {
            this.zeroByUs = zeroByUs;
        }

        public boolean isZeroByUs() {
            return zeroByUs;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        Node[][] matrix = new Node[4][4];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Node node = new Node();

                if (i == 2 && j == 1) {
                    node.setValue(0);
                    matrix[i][j] = node;
                } else {
                    node.setValue(count++);
                    matrix[i][j] = node;
                }
            }
        }

        print(matrix, n);
        process(matrix, n);
        print(matrix, n);
    }

    private static void process(Node[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].getValue() == 0 && !matrix[i][j].isZeroByUs()) {
                    makeRowZero(matrix, i, n);
                    makeColZero(matrix, j, n);
                }
            }
        }
    }

    private static void print(Node[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void makeRowZero(Node[][] matrix, int rowNum,  int n) {
        for (int i = 0; i < n; i++) {
            matrix[rowNum][i].setValue(0);
            matrix[rowNum][i].setZeroByUs(true);
        }
    }

    private static void makeColZero(Node[][] matrix, int colNum,  int n) {
        for (int i = 0; i < n; i++) {
            matrix[i][colNum].setValue(0);
            matrix[i][colNum].setZeroByUs(true);
        }
    }
}
