package solutions.day4;

import java.util.*;

// 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != i+1) {
                if (nums[nums[i]-1] == nums[i]) break;
                swap(nums, nums[i]-1, i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) list.add(nums[i]);
        }
        return list;
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
