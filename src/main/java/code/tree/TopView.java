package code.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sharifahmed
 * @since 5/25/18
 */
public class TopView {

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

        root.left = node2;
        root.right = node3;
        node2.right = node4;
        node4.right = node5;
        node5.right = node6;

        printTopView(root);
    }

    private static class NodeDetails {
        Node node;
        int distance;

        private NodeDetails(Node node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    private static void printTopView(Node root) {
        if (root == null) {
            return;
        }

        HashSet<Integer> distanceLookup = new HashSet<>();
        Queue<NodeDetails> queue = new LinkedList<>();

        queue.add(new NodeDetails(root, 0));

        while (!queue.isEmpty()) {
            NodeDetails nodeDetails = queue.remove();
            Node node = nodeDetails.node;
            int distance = nodeDetails.distance;

            if (!distanceLookup.contains(distance)) {
                System.out.print(node.value + " ");
                distanceLookup.add(distance);
            }

            if (node.left != null) {
                queue.add(new NodeDetails(node.left, distance - 1));
            }
            if (node.right != null) {
                queue.add(new NodeDetails(node.right, distance + 1));
            }
        }
    }
}
