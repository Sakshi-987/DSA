import java.util.*;

public class modifiedDFS {

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

    // createGraph method
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 1st connected component of graph
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

        // another connected component of graph
        graph[5].add(new Edge(5, 6, 2));
        graph[5].add(new Edge(5, 7, 3));

        // 6th index
        graph[6].add(new Edge(6, 5, 2));
        graph[6].add(new Edge(6, 8, 5));
        graph[6].add(new Edge(6, 9, 4));
        // 7th index
        graph[7].add(new Edge(7, 5, 3));
        // 8th index
        graph[8].add(new Edge(8, 6, 5));
        // 9th index
        graph[9].add(new Edge(9, 6, 4));

        // another component
        // as it've only single node so we don't insert anything means it remains empty.

    }

    public static ArrayList<Integer> dfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, output, i, vis);
            }
        }
        return output;
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, ArrayList<Integer> output, int curr, boolean[] vis) {
        output.add(curr);
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfsUtil(graph, output, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 11;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        // printing dfs order
        System.out.println(dfs(graph));
        // output for the given graph will be : 0->1->2->3->4->5->6->8->9->10
    }
}
