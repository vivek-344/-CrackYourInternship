import java.util.*;

// Smallest Positive Missing
// https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
public class SmallestPositiveMissing {
    static int missingNumber(int arr[], int size)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num: arr)
            set.add(num);
        for(int i = 1; true; i++)
            if(!set.contains(i)) return i;
    }
}
