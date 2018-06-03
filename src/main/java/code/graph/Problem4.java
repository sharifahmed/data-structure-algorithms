package code.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sharifahmed
 * @since 5/1/18
 *
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes
 */
public class Problem4 {

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

        System.out.println(hasRoute(g, 1, 3));
    }

    private static boolean hasRoute(Graph g, int src, int dest) {
        if (src == dest) {
            return true;
        }

        boolean[] visited = new boolean[g.noOfNodes];
        Queue<Integer> queue = new LinkedList<>();

        visited[src] = true;
        queue.add(src);

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer adjNode : g.nodes[node]) {
                if (adjNode == dest) {
                    return true;
                }

                if (!visited[adjNode]) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }

        return false;
    }
}
