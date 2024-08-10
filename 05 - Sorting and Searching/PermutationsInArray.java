import java.util.Arrays;

// Geeks for Geeks: Permutations In Array
// https://www.geeksforgeeks.org/problems/permutations-in-array1747/1
public class PermutationsInArray {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr2.length-1;
        for(int i = 0; i <= n; i++) {
            if (arr1[i]+arr2[n-i] < k) return false;
        }
        return true;
    }
}
