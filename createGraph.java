import java.util.*;

public class createGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void creatingGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0th index
        graph[0].add(new Edge(0, 1, 5));
        // 1st index
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // 2nd index
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        // 3rd index
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        // 4th index
        graph[4].add(new Edge(4, 2, 2));
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creatingGraph(graph);
        
        // printing neighbor of each vertex
        for (int i = 0; i < graph.length; i++) {
            // int vertex = i;
            System.out.print("Neighbours of "+i+": ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }

        // adding for funny purpose , so chillllll guyssss
        System.out.println("ThankYou for looking upto my graph....I Can't tell you but i'm lietrally crying by seeing you efforts. ");
    }
}
