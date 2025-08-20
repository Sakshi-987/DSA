import java.util.*;

public class bfsNdfs2 {
    // doing bfs and dfs through "list of list " not "array of list".

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

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph, int v) {
        ArrayList<Integer> output = new ArrayList<>(); // return the list of bfs order
        Queue<Integer> q = new LinkedList<>(); // storing neighb then checking for unvisited ele
        boolean[] vis = new boolean[v]; // track whether ele is vis or not
        // adding 0 in queue
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                output.add(curr);
                vis[curr] = true;
                for (int i = 0; i < graph.get(curr).size(); i++) {
                    int neigh = graph.get(curr).get(i);
                    if (!vis[neigh]) { // it'll not add visied neighbours
                        q.add(neigh);
                    }
                }
            }
        }
        return output;
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> graph) {
        // suppose it's given that you can only take graph as parameter now find dfs
        // order
        // we make vis array and out list here and call another dfs method
        ArrayList<Integer> output = new ArrayList<>();
        boolean[] vis = new boolean[graph.size()];
        dfsUtil(graph, output, 0, vis);
        return output;
    }

    public static void dfsUtil(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> output, int curr,boolean[] vis) {
        vis[curr] = true;
        output.add(curr);

        // for (int i = 0; i < graph.get(curr).size(); i++) {
        // int neigh = graph.get(curr).get(i);
        // if(!vis[neigh]){
        // dfsUtil(graph, output, neigh, vis);
        // }
        // }

        // also find neigh by this way
        for (int neigh : graph.get(curr)) {
            if (!vis[neigh]) {
                dfsUtil(graph, output, neigh, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        createGraph(graph, v);
        System.out.println(bfs(graph, v)); // T.C -> O(V+E)
        System.out.println(dfs(graph));
    }
}
