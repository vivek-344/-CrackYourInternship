package solutions.day5;

// 424. Longest Repeating Character Replacement
// https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int max = Integer.MIN_VALUE;
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            int start = 0, end = 0, change = 0;
            while (end < s.length()) {
                if(s.charAt(end) == ch) end++;
                else if(change < k) {
                    change++;
                    end++;
                } else {
                    if (s.charAt(start) != ch) change--;
                    start++;
                }
                max = Math.max(max, end - start);
            }
        }
        return max;
    }
}
