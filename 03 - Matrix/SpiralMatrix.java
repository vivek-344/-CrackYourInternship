import java.util.*;

// 54. Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int p = 0, q = 0;
        int len = m*n;
        while (list.size() < len) {
            for (int i = q; i < n; i++)
                list.add(matrix[p][i]);
            p++;
            if (list.size() < len) {
                for (int i = p; i < m; i++)
                    list.add(matrix[i][n-1]);
                n--;
            }
            if (list.size() < len) {
                for (int i = n-1; i >= q; i--)
                    list.add(matrix[m-1][i]);
                m--;
            }
            if (list.size() < len) {
                for (int i = m-1; i >= p; i--)
                    list.add(matrix[i][q]);
                q++;
            }
        }

        return list;
    }
}
