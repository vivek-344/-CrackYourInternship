import java.util.*;

// Geeks for Geeks: BFS of Graph
// https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
class BFSofGraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()) {
            int curr = q.remove();
            list.add(curr);
            for (int num: adj.get(curr)) {
                if (!visited[num]) {
                    visited[num] = true;
                    q.add(num);

                }
            }
        }
        return list;
    }
}