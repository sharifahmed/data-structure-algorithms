package code.tree;

/**
 * @author sharifahmed
 * @since 4/28/18
 *
 * Traversal
 */
public class Problem1 {

    public static void main(String[] args) {
        Node root = createTree();

        printInOrder(root);
        System.out.println();
        printPreOrder(root);
        System.out.println();
        printPostOrder(root);
    }

    private static void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.getLeft());
        System.out.print(node.getValue());
        printInOrder(node.getRight());
    }

    private static void printPreOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getValue());
        printPreOrder(node.getLeft());
        printPreOrder(node.getRight());
    }

    private static void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.getLeft());
        printPostOrder(node.getRight());
        System.out.print(node.getValue());
    }

    private static class Node {

        private int value;
        private Node left;
        private Node right;

        public int getValue() {
            return value;
        }

        public Node setValue(int value) {
            this.value = value;
            return this;
        }

        public Node getLeft() {
            return left;
        }

        public Node setLeft(Node left) {
            this.left = left;
            return this;
        }

        public Node getRight() {
            return right;
        }

        public Node setRight(Node right) {
            this.right = right;
            return this;
        }
    }

    private static Node createTree() {
        Node root = new Node().setValue(1);
        Node node2 = new Node().setValue(2);
        Node node3 = new Node().setValue(3);
        Node node4 = new Node().setValue(4);

        root.setLeft(node2).setRight(node3);
        node3.setLeft(node4);

        return root;
    }
}
