package main.java.prep.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 5/1/18
 * <p>
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth
 */
public class Problem3 {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        root.left = node2;
        root.right = node3;
        node3.left = node4;

        List<List<Integer>> nodesPerDepth = new ArrayList<>(3);

        traverse(root, nodesPerDepth, 0);

        for (List<Integer> nodes : nodesPerDepth) {
            for (Integer node : nodes) {
                System.out.print(node);
            }
            System.out.println();
        }
    }

    private static void traverse(Node root, List<List<Integer>> nodesPerDepth, int depth) {
        if (root == null) {
            return;
        }

        List<Integer> nodes;

        if (nodesPerDepth.size() == depth) {
            nodes = new ArrayList<>();
            nodesPerDepth.add(nodes);

        } else {
            nodes = nodesPerDepth.get(depth);
        }

        nodes.add(root.value);

        traverse(root.left, nodesPerDepth, depth + 1);
        traverse(root.right, nodesPerDepth, depth + 1);
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
