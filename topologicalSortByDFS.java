import java.util.*;

public class topologicalSortByDFS {
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
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
    }

    public static ArrayList<Integer> topoSort(ArrayList<Edge>[] graph) {
        ArrayList<Integer> order = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topoSortUtil(graph, i, s, vis);
            }
        }
        // printing once all are tracked and inserted in stack
        while (!s.isEmpty()) {
            order.add(s.pop());
        }
        return order;
    }

    public static void topoSortUtil(ArrayList<Edge>[] graph, int curr, Stack<Integer> s, boolean[] vis) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topoSortUtil(graph, e.dest, s, vis);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(topoSort(graph));
    }
}
