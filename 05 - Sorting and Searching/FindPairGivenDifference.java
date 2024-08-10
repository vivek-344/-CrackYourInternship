import java.util.HashSet;

// Geeks for Geeks: Find Pair Given Difference
// https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
public class FindPairGivenDifference {
    public int findPair(int n, int x, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: arr) {
            int n1 = num - x;
            int n2 = num + x;
            if (set.contains(n1) || set.contains(n2)) return 1;
            set.add(num);
        }
        return -1;
    }
}
