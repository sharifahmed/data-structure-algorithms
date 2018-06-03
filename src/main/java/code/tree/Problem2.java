package code.tree;

/**
 * @author sharifahmed
 * @since 5/1/18
 * <p>
 * Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a
 * binary search tree with minimal height.
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        Node root = createMinimalBST(array, 0, array.length - 1);
        printInOrder(root);
    }

    private static Node createMinimalBST(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        Node node = new Node(array[mid]);
        node.left = createMinimalBST(array, start, mid - 1);
        node.right = createMinimalBST(array, mid + 1, end);

        return node;
    }

    private static void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.value);
        printInOrder(node.right);
    }

    private static class Node {

        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }
}
