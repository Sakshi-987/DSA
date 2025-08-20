import java.util.*;

public class detectCycleInUndirectedGraph {
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 index
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 0, 1));
        graph[4].add(new Edge(4, 2, 1));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1))
                    return true;
            }
        }
        return false;
    }

    // util method
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            // case 1-> neighbour is unvisited, call dfsUtil and check does cycle exist in
            // that part
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr))
                    return true;
            }
            // case 2-> neighbour is visited but not parent means it got visited by another
            // node before curr node i.e cycle exist
            else if (vis[e.dest] && e.dest != par)
                return true;
            // case3-> neighbour is visited and it's parent can't say anyhting about this
            // case. so do nothing i.e continue
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(detectCycle(graph));
        // return false if we comment out 0->2 and 2->0 
    }
}
