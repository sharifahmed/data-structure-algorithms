package main.java.prep.tree;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * @author sharifahmed
 * @since 2019-09-03
 */
public class BST {

    static class Node {

        Node left;
        Node right;
        int data;

        private Node(int data) {
            this.data = data;
        }

        private void insert(int val) {
            if (val > data) {
                if (nonNull(right)) {
                    right.insert(val);
                } else {
                    right = new Node(val);
                }
            } else {
                if (nonNull(left)) {
                    left.insert(val);
                } else {
                    left = new Node(val);
                }
            }
        }

        private boolean contains(int val) {
            int result = Integer.compare(val, data);
            if (result == 0) {
                return true;
            } else if (result < 0 && nonNull(left) && left.contains(val)) {
                return true;
            } else if (result > 0 && nonNull(right) && right.contains(val)) {
                return true;
            }
            return false;
        }

        private void printInOrder() {
            if (nonNull(left)) {
                left.printInOrder();
            }
            System.out.println(data);
            if (nonNull(right)) {
                right.printInOrder();
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.insert(2);
        node.insert(5);
        node.insert(15);
        node.insert(18);
        node.insert(1);

        node.printInOrder();

        System.out.println(node.contains(5));
        System.out.println(node.contains(20));
    }
}
