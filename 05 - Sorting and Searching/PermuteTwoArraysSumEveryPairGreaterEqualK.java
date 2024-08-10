// Geeks for Geeks: Permute Two Arrays Sum Every Pair Greater Equal K
// https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/
public class PermuteTwoArraysSumEveryPairGreaterEqualK {
    boolean solution(int[] arr1, int[] arr2, int k) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[i] >= k) return true;
        }
        return false;
    }
}
