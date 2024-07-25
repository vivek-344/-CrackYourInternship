package solutions.day1;

// 75. Sort Colors
class Solution75 {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;
        while (mid <= end) {
            switch(nums[mid]) {
                case 0:
                    swap(nums, start++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, end--);
            }
        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
