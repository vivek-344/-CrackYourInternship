package solutions.day2;

// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[start] = nums[i];
                start++;
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

/*
// Brute Force
class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if(nums[start] == 0) {
                for (int i = start; i < end; i++) {
                    swap(nums, i, i + 1);
                }
                end--;
            } else
                start++;
        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
 */