package main.java.prep.graph;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author sharifahmed
 * @since 4/29/18
 *
 * Adjacency List
 */
public class Problem1 {

    private static class Graph {

        private int noOfNodes;
        private LinkedList<Integer> nodes[];

        Graph(int noOfNodes) {
            this.noOfNodes = noOfNodes;

            this.nodes = new LinkedList[noOfNodes];

            for (int v = 0; v < noOfNodes; v++) {
                this.nodes[v] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            this.nodes[src].addFirst(dest);
            this.nodes[dest].addFirst(src);
        }

        public void print() {
            for (int v = 0; v < noOfNodes; v++) {
                System.out.print(v + " : ");

                Collections.sort(nodes[v]);

                for (Integer node : nodes[v]) {
                    System.out.print(node + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int onOfVertices = 5;

        Graph g = new Graph(onOfVertices);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.print();
    }
}
