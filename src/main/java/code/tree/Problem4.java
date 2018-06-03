package code.tree;

/**
 * @author sharifahmed
 * @since 5/2/18
 * <p>
 * Implement a function to check if a binary tree is balanced
 */
public class Problem4 {

    private static class Node {

        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node4.right = node5;
        node2.right = node6;
        node3.right = node7;

        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(Node root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    private static int checkHeight(Node root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
