// Geeks for Geeks: Ceiling In A Sorted Array
// https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/
public class CeilingInASortedArray {
    void solution(int[] arr, int k) {
        int ceil = binarySearchCeil(arr, k, 0, arr.length - 1);
        if (ceil == -1)
            System.out.println("No ceil!");
        else
            System.out.println("Ceil: "+ceil);
    }

    private static int binarySearchCeil(int[] arr, int target, int low, int high) {
        if (low > high)
            return -1;
        int mid = (high + low) / 2;
        if (arr[mid] == target)
            return arr[mid];
        if (arr[mid] > target) {
            int ceil = binarySearchCeil(arr, target, low, mid - 1);
            return (ceil >= target) ? ceil : arr[mid];
        } else
            return binarySearchCeil(arr, target, mid + 1, high);
    }
}
