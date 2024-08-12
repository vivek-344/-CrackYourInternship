import java.util.*;

// DFS of Graph
// https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
class DFSofGraph {
    ArrayList<Integer> list;
    boolean[] visited;
    ArrayList<ArrayList<Integer>> adjList;
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        list = new ArrayList<>();
        visited = new boolean[V];
        Arrays.fill(visited, false);
        adjList = adj;
        dfs(0);
        return list;
    }
    void dfs(int node) {
        list.add(node);
        visited[node] = true;
        for (int n: adjList.get(node)) {
            if (!visited[n]) dfs(n);
        }
    }
}