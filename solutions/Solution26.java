package solutions;

// 26. Remove Duplicates from Sorted Array
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int index = 1, curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != curr) {
                curr = nums[i];
                swap(nums, index, i);
                index++;
            }
        }
        return index;
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
