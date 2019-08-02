package main.java.prep.graph;

import java.util.LinkedList;

/**
 * @author sharifahmed
 * @since 4/30/18
 *
 * DFS
 */
public class Problem2 {

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

    public static void DFS(Graph g, int node, boolean[] visited) {
        System.out.println(node);
        visited[node] = true;

        for (Integer child : g.nodes[node]) {
            if (!visited[child]) {
                DFS(g, child, visited);
            }
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

        boolean[] visited = new boolean[noOfVertices];
        DFS(g, 0, visited);
    }
}
