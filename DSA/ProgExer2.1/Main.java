import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //read file---------------------------------------------------------------
        ArrayList<String> verEd = new ArrayList<>();
        File file = new File ("graph.txt");
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNext()) {
            verEd.add(fileReader.nextLine());
        }

        fileReader.close();

        //create BST--------------------------------------------------------------
        BST tree = new BST (verEd.size());
        for (String line : verEd) {

            String[] x = line.split(" ");
            if (x.length == 1) {
                tree.insertNode(x[0].charAt(0));
            } else if (x.length == 3){
                char src = x[0].charAt(0);
                char dtn = x[1].charAt(0);
                int wei = Integer.parseInt(x[2]);

                tree.insertEdge(src, dtn, wei);
            }
                
        }

        //user input--------------------------------------------------------------
        Scanner userInput = new Scanner(System.in);
        System.out.print("Starting Vertex: ");
        char start = userInput.next().charAt(0);

        userInput.close();

        //dijkstra (shortest path)-----------------------------------------------------------
        int[] shortPath = tree.dijkstra(start);
        for (int i = 0; i < tree.nodes.size(); i++) {
            if (i != tree.nodes.indexOf(start)) {
                
                char dtn = tree.nodes.get(i);
                int dst = shortPath[i];

                if(dst == Integer.MAX_VALUE) {
                    System.out.println(dtn + " Infinity");
                } else {
                    System.out.println(dtn + " " + dst);
                }

            }
        }

    }
}
