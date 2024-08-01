package solutions.day6;

// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for(int i = n/2 - 1; i >= 0; i--)
            heapify(nums, i, n);

        for (int i = 0; i < n; i++) {
            if (i == k-1) return nums[0];
            heap(nums, n-i);
        }

        return nums[0];
    }

    void heapify(int[] arr, int index, int n) {
        int i = index;
        int l = i*2 + 1;
        int r = i*2 + 2;

        if (l < n && arr[i] < arr[l])
            i = l;

        if (r < n && arr[i] < arr[r])
            i = r;

        if(i != index) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            heapify(arr, i, n);
        }
    }

    void heap(int[] arr, int n) {
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        heapify(arr, 0, n-1);
    }
}
