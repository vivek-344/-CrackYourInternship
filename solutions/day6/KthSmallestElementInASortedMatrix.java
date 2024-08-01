package solutions.day6;

// 378. Kth Smallest Element in a Sorted Matrix
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        for (int i = n*n/2 - 1; i >= 0; i--)
            heapify(matrix, i, n, n-1, n-1);

        for (int i = 0; i < n*n; i++) {
            if (i == k-1) return matrix[0][0];
            heap(matrix, n*n-i, n);
        }

        return matrix[0][0];
    }

    void heapify(int[][] matrix, int index, int n, int p, int q) {
        int i = index;
        int l = index*2 + 1;
        int r = index*2 + 2;

        if (l/n < p && matrix[l/n][l%n] < matrix[i/n][i%n])
            i = l;
        if (l/n == p && l%n <= q && matrix[l/n][l%n] < matrix[i/n][i%n])
            i = l;

        if (r/n < p && matrix[r/n][r%n] < matrix[i/n][i%n])
            i = r;
        if (r/n == p && r%n <=q && matrix[r/n][r%n] < matrix[i/n][i%n])
            i = r;

        if (i != index) {
            int temp = matrix[i/n][i%n];
            matrix[i/n][i%n] = matrix[index/n][index%n];
            matrix[index/n][index%n] = temp;
            heapify(matrix, i, n, p, q);
        }
    }

    void heap(int[][] arr, int i, int n) {
        int temp = arr[0][0];
        arr[0][0] = arr[(i-1)/n][(i-1)%n];
        arr[(i-1)/n][(i-1)%n] = temp;
        heapify(arr, 0, n, (i-2)/n, (i-2)%n);
    }
}
