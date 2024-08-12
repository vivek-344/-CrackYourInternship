// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0') continue;
                char up, left;
                if(i-1 < 0) up = '0';
                else up = grid[i-1][j];
                if (j-1 < 0) left = '0';
                else left = grid[i][j-1];
                if(up == '1' || left == '1') continue;
                else count++;
            }
        }
        return count;
    }
}
