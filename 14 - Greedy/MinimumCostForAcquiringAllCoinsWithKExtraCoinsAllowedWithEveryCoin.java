import java.util.*;

// Geeks for Geeks: Minimum Cost For Acquiring All Coins With K Extra Coins Allowed With Every Coin
// https://www.geeksforgeeks.org/minimum-cost-for-acquiring-all-coins-with-k-extra-coins-allowed-with-every-coin/
class MinimumCostForAcquiringAllCoinsWithKExtraCoinsAllowedWithEveryCoin {
    int minimumCost(int n, int[] coin, int k) {
        Arrays.sort(coin);

        int coins_needed = (int)Math.ceil(1.0 * n / (k + 1));

        int ans = 0;

        for (int i = 0; i <= coins_needed - 1; i++)
            ans += coin[i];

        return ans;
    }
}