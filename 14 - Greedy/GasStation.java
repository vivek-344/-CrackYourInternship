// 134. Gas Station
// https://leetcode.com/problems/gas-station/
class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = gas[i] - cost[i];
            sum += arr[i];
        }

        if (sum < 0) return -1;

        int start = 0;
        int currGas = 0;

        for (int i = 0; i < gas.length; i++) {
            currGas += arr[i];
            if (currGas < 0) {
                currGas = 0;
                start = i + 1;
            }
        }
        return start;
    }
}