import java.io.*;
import java.util.*;

public class Graphing {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("graph.txt");
        Scanner fileReader = new Scanner(file);
        ArrayList<String> placeHolder = new ArrayList<>();

        while (fileReader.hasNext()) {
            placeHolder.add(fileReader.nextLine());
        }

        NodeGraph newGraph = new NodeGraph(placeHolder.size());

        for (String line : placeHolder) {
            String[] snglVal = line.split(" ");
            if (snglVal.length == 1) {
                newGraph.insertNode(snglVal[0].charAt(0));
            } else if (snglVal.length == 3) {
                char source = snglVal[0].charAt(0);
                char destination = snglVal[1].charAt(0);
                int weight = Integer.parseInt(snglVal[2]);
                newGraph.insertEdge(source, destination, weight);
            }
        }

        fileReader.close();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the starting vertex: ");
        char startVertex = userInput.next().charAt(0);

        int[] shortestDistances = newGraph.dijkstra(startVertex);

        System.out.println();
        System.out.println("Starting Vertex: " + startVertex);
        for (int i = 0; i < newGraph.nodes.size(); i++) {
            if (i != newGraph.nodes.indexOf(startVertex)) {
                char destination = newGraph.nodes.get(i);
                int distance = shortestDistances[i];

                if (distance == Integer.MAX_VALUE) {
                    System.out.println(destination + "  Infinity");
                } else {
                    System.out.println(destination + "  " + distance);
                }
            }
        }

        userInput.close();
    }
}