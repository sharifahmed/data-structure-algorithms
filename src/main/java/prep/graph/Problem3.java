package main.java.prep.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sharifahmed
 * @since 4/30/18
 *
 * BFS
 */
public class Problem3 {

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
            this.nodes[src].add(dest);
        }
    }

    public static void main(String[] args) {
        int noOfVertices = 7;
        Graph g = new Graph(noOfVertices);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 5);
        g.addEdge(1, 6);
        g.addEdge(2, 4);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(4, 1);
        g.addEdge(6, 4);

        BFS(g, 0, noOfVertices);
    }

    private static void BFS(Graph g, int root, int noOfVertices) {
        boolean[] visited = new boolean[noOfVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[root] = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);

            for (Integer adjNode : g.nodes[node]) {
                if (!visited[adjNode]) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }
    }
}
