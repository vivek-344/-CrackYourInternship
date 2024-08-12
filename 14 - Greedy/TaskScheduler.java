import java.util.Arrays;

// 621. Task Scheduler
// https://leetcode.com/problems/task-scheduler/
class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char ch : tasks)
            freq[ch - 'A']++;

        Arrays.sort(freq);

        int maxFreq = freq[25];

        int count = (maxFreq - 1) * (n + 1);

        for (int i = 25; i >= 0 && freq[i] == maxFreq; i--)
            count++;

        return Math.max(count, tasks.length);
    }
}