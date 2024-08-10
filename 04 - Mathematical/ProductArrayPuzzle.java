// Geeks for Geeks: Product Array Puzzle
// https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n)
    {
        long product = 1;
        boolean zero = false;
        for (int num: nums) {
            if (!zero && num == 0) {
                zero = true;
                continue;
            }
            product *= num;
        }
        long[] arr = new long[n];
        if (product == 0) return arr;
        for (int i = 0; i < n; i++) {
            if (!zero)
                arr[i] = product/nums[i];
            else if (nums[i] == 0)
                arr[i] = product;
        }
        return arr;
    }
}
