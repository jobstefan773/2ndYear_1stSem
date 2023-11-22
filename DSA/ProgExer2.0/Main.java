import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        
        file();
        DFS("A", new HashSet<>());

    }

    public static void file () throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("graph.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.length() == 1) {
                addVertex(line);
            } else {
                String[] vertices = line.split(" ");
                addEdge(vertices[0], vertices[1]);
            }
        }

        reader.close();

    }

    private static Map <String, List<String>> adjacencyList = new HashMap<>();
    private static Map <String, Map<String, Integer>> incidenceMatrix = new HashMap<>();
    public static void addVertex (String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
        incidenceMatrix.putIfAbsent(vertex, new HashMap<>());
    }

    public static void addEdge (String src, String dst) {
        adjacencyList.get(src).add(dst);
        String edge = src + "-" + dst;
        incidenceMatrix.putIfAbsent(src, new HashMap<>());
        incidenceMatrix.get(src).put(edge, 1);
    }

    // public static void printAdjacencyList() {
    //     System.out.print("   ");
    //     for (String vertex : adjacencyList.keySet()) {
    //         System.out.print(vertex + "  ");
    //     }
    //     System.out.println();
    
    //     for (String vertex : adjacencyList.keySet()) {
    //         System.out.print(vertex + "  ");
    //         for (String vertex2 : adjacencyList.keySet()) {
    //             if (adjacencyList.get(vertex).contains(vertex2)) {
    //                 System.out.print("1  ");
    //             } else {
    //                 System.out.print("0  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void printIncidenceMatrix() {
    //     System.out.print("   ");
    //     for (String edge : incidenceMatrix.get(adjacencyList.keySet().iterator().next()).keySet()) {
    //         System.out.print(edge + " ");
    //     }
    //     System.out.println();
    
    //     for (String vertex : incidenceMatrix.keySet()) {
    //         System.out.print(vertex + "  ");
    //         for (String edge : incidenceMatrix.get(vertex).keySet()) {
    //             if (incidenceMatrix.get(vertex).get(edge) != null) {
    //                 System.out.print(incidenceMatrix.get(vertex).get(edge) + " ");
    //             } else {
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void DFS(String vertex, Set<String> visited) {
        visited.add(vertex);
        System.out.print(vertex + "-");
    
        for (String neighbor : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                DFS(neighbor, visited);
            }
        }
    }
}