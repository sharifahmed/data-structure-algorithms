package prep.hackerrank.interviewprep.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 9/16/19
 */
public class FindTheNearestClone {

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

    static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, int[] ids, int val) {
        Graph graph = new Graph(graphNodes);

        int noOfEdges = graphFrom.length;
        for (int i = 0; i < noOfEdges; i++) {
            graph.addEdge(graphFrom[i], graphTo[i]);
        }

        int minPathLen = Integer.MAX_VALUE;

        for (int i = 0; i < graphNodes; i++) {
            if (ids[i] == val) {
                int pathLen = bfs(graph, ids, i + 1, val);
                if (pathLen != -1) {
                    minPathLen = Math.min(minPathLen, pathLen);
                }
            }
        }

        return minPathLen == Integer.MAX_VALUE ? -1 : minPathLen;
    }

    private static int bfs(Graph graph, int[] ids, int source, int val) {
        graph.setSource(source);

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(source);
        queue.add(source);

        int pathLen = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer n : graph.nodes[node]) {
                if (ids[n - 1] == val && n != source) {
                    return pathLen + 1;
                }
                if (!visited.contains(n)) {
                    visited.add(n);
                    queue.add(n);
                    pathLen += 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findShortest(4, new int[]{1, 1, 4}, new int[]{2, 3, 2}, new int[]{1, 2, 1, 1}, 1));
        System.out.println(findShortest(4, new int[]{1, 1, 4}, new int[]{2, 3, 2}, new int[]{1, 2, 3, 4}, 2));
        System.out.println(findShortest(5, new int[]{1, 1, 2, 3}, new int[]{2, 3, 4, 5}, new int[]{1, 2, 3, 3, 2}, 3));
    }
}
