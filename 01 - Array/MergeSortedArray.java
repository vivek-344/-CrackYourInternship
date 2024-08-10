import java.util.Arrays;

// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++)
            nums1[m++] = nums2[i];

        Arrays.sort(nums1);
    }
}
