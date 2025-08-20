import java.util.*;
// iven an undirected graph with V vertices numbered from 0 to V-1 and E edges, represented as a 2D array edges[][], where each entry edges[i] = [u, v] denotes an edge between vertices u and v.
// Your task is to return a list of all connected components. Each connected component should be represented as a list of its vertices, with all components returned in a collection where each component is listed separately.

public class countConnectedComponents {

    public static ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // creating graph in adjaceny list form
        ArrayList<ArrayList<Integer>> graph = adjList(V, edges);

        // for storing components
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        boolean[] vis = new boolean[V];
        int count = 0; // count no. of connected compo

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
            count++; //counting no. of connected graph
                ArrayList<Integer> connectedCompo = new ArrayList<>();
                dfs(graph, i, vis, connectedCompo);
                output.add(connectedCompo);
            }
        }
        System.out.println("number of connected componenrs is: "+ count);
        return output;
    }

    // dfs function
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int curr, boolean[] vis,
            ArrayList<Integer> connectedCompo) {

        vis[curr] = true;
        connectedCompo.add(curr);
        for (int neigh : graph.get(curr)) {
            if (!vis[neigh]) {
                dfs(graph, neigh, vis, connectedCompo);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> adjList(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] neigh : edges) {
            int u = neigh[0]; //0th index ele of list
            int v = neigh[1]; //1st index ele of list

            // adding them (neigh) in adja list form
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }

    public static void main(String[] args) {
        int V= 5;
        int[][] edges = { { 0, 1 }, { 2, 1 }, { 3, 4 } };
        System.out.println(getComponents(V, edges));
    }
}
