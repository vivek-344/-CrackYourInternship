package solutions.day2;

// 493. Reverse Pairs
// https://leetcode.com/problems/reverse-pairs/
// Intuition: https://www.youtube.com/watch?v=0e4bZaP3MDI
public class ReversePairs {
    public int reversePairs(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    int sort(int arr[], int l, int r) {
        if (l >= r) {
            return 0;
        }

        int m = l + (r - l) / 2;
        int count = sort(arr, l, m) + sort(arr, m + 1, r);

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        count += helper(L, R);

        merge(arr, l, m, r);

        return count;
    }

    int helper(int[] L, int[] R) {
        int count = 0;
        int j = 0;
        for (int num : L) {
            while (j < R.length && num > 2L * R[j]) {
                j++;
            }
            count += j;
        }
        return count;
    }
}
