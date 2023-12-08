import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NodeGraph {

    ArrayList<Character> nodes;
    int[][] graphMatrix;

    public NodeGraph(int size) {
        nodes = new ArrayList<>();
        graphMatrix = new int[size][size];
    }

    public void insertNode(char node) {
        nodes.add(node);
    }

    public void insertEdge(char source, char destination, int weight) {
        int sourceIndex = nodes.indexOf(source);
        int destinationIndex = nodes.indexOf(destination);

        if (sourceIndex != -1 && destinationIndex != -1) {
            graphMatrix[sourceIndex][destinationIndex] = weight;
        }
    }

    public void printMatrix() {
        System.out.print("  ");
        for (char node : nodes) {
            System.out.print("   " + node);
        }
        System.out.println();

        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(" " + nodes.get(i) + " ");

            for (int j = 0; j < nodes.size(); j++) {
                System.out.print("  " + graphMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[] dijkstra(char startVertex) {
        int startIdx = nodes.indexOf(startVertex);
        int size = nodes.size();
        int[] distance = new int[size];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[startIdx] = 0;

        PriorityQueue<NodeDistance> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new NodeDistance(startIdx, 0));

        while (!priorityQueue.isEmpty()) {
            NodeDistance current = priorityQueue.poll();
            int currentIdx = current.node;
            int currentDist = current.distance;

            for (int neighborIdx = 0; neighborIdx < size; neighborIdx++) {
                if (graphMatrix[currentIdx][neighborIdx] != 0) {
                    int newDist = currentDist + graphMatrix[currentIdx][neighborIdx];
                    if (newDist < distance[neighborIdx]) {
                        distance[neighborIdx] = newDist;
                        priorityQueue.add(new NodeDistance(neighborIdx, newDist));
                    }
                }
            }
        }

        return distance;
    }

    private static class NodeDistance implements Comparable<NodeDistance> {
        int node;
        int distance;

        public NodeDistance(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(NodeDistance other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}