import java.util.*;
import java.util.*;

public class creatingGraph2 {
    // creating graph in "ArrayList<ArrayList<Integer>>" form according to standard
    // question solving form
    // doing bfs & dfs from this form only
    // we don't need Edge class in this format

    // for weighted graph we create arr in inner list
    // ..."ArrayList<ArrayList<int[]>>" so that every list contains its destination
    // with their wt.

    // undirected unweighted graph
    public static void createGraph(ArrayList<ArrayList<Integer>> graph, int v) {
        // initialising AL on every index of AL
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        // 0th index
        graph.get(0).add(1);
        graph.get(0).add(2);
        // index-1
        graph.get(1).add(0);
        graph.get(1).add(3);
        // ind-2
        graph.get(2).add(0);
        graph.get(2).add(4);
        // ind-3
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        // ind-4
        graph.get(4).add(2);
        graph.get(4).add(3);
        graph.get(4).add(5);
        // ind-5
        graph.get(5).add(3);
        graph.get(5).add(4);
        graph.get(5).add(6);
        // ind-6
        graph.get(6).add(5);
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        createGraph(graph, v);
        // printing the neighbours of every vertex
        for (int i = 0; i < v; i++) {
            System.err.print(i + "->");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

}
