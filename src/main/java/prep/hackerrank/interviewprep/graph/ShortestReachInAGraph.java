package prep.hackerrank.interviewprep.graph;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 9/16/19
 */
public class ShortestReachInAGraph {

    public static class Graph {
        private int source;
        private int noOfNodes;
        private LinkedList<Integer> nodes[];

        public Graph(int noOfNodes) {
            this.noOfNodes = noOfNodes;
            nodes = new LinkedList[noOfNodes + 1];
            IntStream.range(0, noOfNodes + 1).forEach(n -> nodes[n] = new LinkedList<>());
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public void addEdge(int scr, int dest) {
            nodes[scr].addFirst(dest);
            nodes[dest].addFirst(scr);
        }
    }

    private static final int NODE_LEN = 6;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int noOfQueries = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < noOfQueries; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            Graph graph = new Graph(n);

            for (int j = 0; j < m; j++) {
                int scr = scanner.nextInt();
                int dest = scanner.nextInt();
                graph.addEdge(scr, dest);
            }

            int source = scanner.nextInt();
            graph.setSource(source);

            int[] distances = getDistances(graph);

            for (int k = 0; k < n; k++) {
                if (k == (source - 1)) {
                    continue;
                }
                System.out.print(distances[k]);
                if (k + 1 < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    private static int[] getDistances(Graph graph) {
        int[] distances = new int[graph.noOfNodes];
        Arrays.fill(distances, -1);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(graph.getSource());
        visited.add(graph.getSource());

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (Integer node : graph.nodes[current]) {
                if (visited.contains(node)) {
                    continue;
                }
                queue.add(node);
                visited.add(node);
                distances[node - 1] = (distances[current - 1] == -1 ? 0 : distances[current - 1]) + NODE_LEN;
            }
        }

        return distances;
    }
}
