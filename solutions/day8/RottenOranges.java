package solutions.day8;

import java.util.*;

// Geeks for Geeks: Rotten Oranges
// https://www.geeksforgeeks.org/problems/rotten-oranges2536/1
public class RottenOranges {
    class It {
        int row;
        int col;
        int time;
        It(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        Queue<It> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new It(i, j, 0));
                    visited[i][j] = true;
                } else if(grid[i][j] == 1) {
                    fresh++;
                    visited[i][j] = false;
                } else visited[i][j] = true;
            }
        }
        int time = 0;
        int row[] = {-1,0,1,0};
        int col[] = {0,1,0,-1};
        int count = 0;
        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            time = Math.max(time, t);
            q.remove();

            for(int i = 0; i < 4; i++) {
                int nr = r + row[i];
                int nc = c + col[i];
                if (nr >= 0 && nr < n && nc >=0 && nc < m && !visited[nr][nc] && grid[nr][nc] == 1) {
                    q.add(new It(nr, nc, t+1));
                    visited[nr][nc] = true;
                    count++;
                }
            }
        }
        if (count != fresh) return -1;
        return time;
    }
}
