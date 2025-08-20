
import java.util.*;

public class practice {

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

    public static void createGraph(ArrayList<ArrayList<Integer>> graph, int v) {
        // initialsing with AL in the graph at every index
        // initially graph = [] ..just this type....without initialising, elemenst are
        // not stored
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        // 1st connected component of graph
        // 0th index
        graph.get(0).add(1);
        // 1st index
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(3);
        // 2nd index
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(4);
        // 3rd index
        graph.get(3).add(1);
        graph.get(3).add(2);
        // 4th index
        graph.get(4).add(2);

        // another connected component of graph
        graph.get(5).add(6);
        graph.get(5).add(7);

        // 6th index
        graph.get(6).add(5);
        graph.get(6).add(8);
        graph.get(6).add(9);
        // 7th index
        graph.get(7).add(5);
        // 8th index
        graph.get(8).add(6);
        // 9th index
        graph.get(9).add(6);
    }

    public static ArrayList<Integer> newBfs(ArrayList<ArrayList<Integer>> graph, int v) {
        boolean[] vis = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if (!vis[i])
                newBfsUtil(graph, i, vis, ans);
        }
        return ans;
    }

    public static void newBfsUtil(ArrayList<ArrayList<Integer>> graph, int node, boolean[] vis,
            ArrayList<Integer> ans) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                ans.add(curr);
                vis[curr] = true;
            }
            for (int neigh : graph.get(curr)) {
                if (!vis[neigh]) {
                    q.add(neigh);
                }
            }
        }
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph, int v) {
        createGraph(graph, v);

        // queue
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>(); // for ans

        // initially adding 0 in q as 1st node
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                ans.add(curr);
                vis[curr] = true;

                for (int i = 0; i < graph.get(curr).size(); i++) {
                    int neigh = graph.get(curr).get(i);
                    q.add(neigh);
                }
            }

        }
        return ans;
    }

    // newDfs
    public static ArrayList<Integer> newDfs(ArrayList<ArrayList<Integer>> graph, int v) {
        boolean[] vis = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                newDfsUtil(graph, vis, ans, i);
            }
        }
        return ans;
    }

    public static void newDfsUtil(ArrayList<ArrayList<Integer>> graph, boolean[] vis, ArrayList<Integer> ans,
            int node) {
            ans.add(node);
        vis[node] = true;
        for (int neigh : graph.get(node)) {
            if (!vis[neigh]) {
                newDfsUtil(graph, vis, ans, neigh);
            }
        }
    }

    // has path
    public static boolean hasPath(ArrayList<ArrayList<Integer>> graph, int src, int dest, boolean[] vis) {
        vis[src] = true;
        if (src == dest)
            return true;

        for (int neigh : graph.get(src)) {
            if (!vis[neigh] && hasPath(graph, neigh, dest, vis))
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int v = 10;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        createGraph(graph, v);

        System.out.println(hasPath(graph, 1, 3, new boolean[v]));
        // src = 0 and dest = 5 , out is false;
        System.out.println("Bfs order");
        System.out.println(newBfs(graph, v));
         System.out.println("Dfs order");
        System.out.println(newDfs(graph, v));
    }
}
