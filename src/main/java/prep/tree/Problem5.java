package main.java.prep.tree;

/**
 * @author sharifahmed
 * @since 5/2/18
 * <p>
 * Implement a function to check if a binary tree is a binary search tree
 */
public class Problem5 {

    private static class Node {

        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        Node node2 = new Node(10);
        Node node3 = new Node(30);
        Node node4 = new Node(5);
        Node node5 = new Node(15);
        Node node6 = new Node(17);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.right = node6;

        System.out.println(checkBST(root, null, null));
    }

    private static boolean checkBST(Node root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if ((min != null && root.value <= min) || (max != null && root.value > max)) {
            return false;
        }

        if (!checkBST(root.left, min, root.value) || !checkBST(root.right, root.value, max)) {
            return false;
        }

        return true;
    }
}
