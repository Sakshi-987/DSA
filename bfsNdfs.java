import java.util.*;

public class bfsNdfs {
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
        // 0th index
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        // 1st index
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        // 2nd index
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        // 3rd index
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        // 4th index
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        // 5th index
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        // 6th index
        graph[6].add(new Edge(6, 5, 1));

    }

    public static ArrayList<Integer> bfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> output = new ArrayList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                vis[curr] = true;
                output.add(curr);
                // finding neighbor and adding into queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        return output;
    }

    // dfs
    public static ArrayList<Integer> dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis,ArrayList<Integer>output) {
        output.add(curr);
        vis[curr] = true;
        // finding neighbors of curr
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, output);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        // output of both bfs depend on which neighbor you added first in graph
        System.out.println(bfs(graph));

        // either make visited arr here or pass "new boolean[v]" directly in function call
        // for storing ans of dfs 
        ArrayList<Integer>output = new ArrayList<>();
        System.out.println(dfs(graph, 0, new boolean[v], output));
    }
}
