package solutions;

// 287. Find the Duplicate Number
class Solution287 {
    public int findDuplicate(int[] nums) {
        int max = (int)Math.pow(10,5) + 2;
        boolean[] arr = new boolean[max];
        for (int num: nums) {
            if (arr[num])
                return num;
            arr[num] = true;
        }
        return -1;
    }
}
