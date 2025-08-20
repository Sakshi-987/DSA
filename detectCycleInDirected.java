import java.util.*;

public class detectCycleInDirected {
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
        // graph1- return false for this as no cycle exist
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 3, 1));

        // graph-2 return true as cycle exist here
        // graph[0].add(new Edge(0,1,1));
        // graph[2].add(new Edge(2,1,1));
        // graph[2].add(new Edge(2,3,1));
        // graph[3].add(new Edge(3,4,1));
        // graph[4].add(new Edge(4,2,1));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack))
                    return true;
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;
        for (Edge e : graph[curr]) {
            if (stack[e.dest])
                return true;
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack))
                return true;
        }
        stack[curr] = false; //this step will be performed when there is no neighbor of curr left
        // it'll call back prev node i.e it's par check if it has more neighbor if not do the same with that node also.
        // similarly with all nodes.
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}