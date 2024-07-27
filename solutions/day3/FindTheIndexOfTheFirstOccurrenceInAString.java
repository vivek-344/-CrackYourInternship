package solutions.day3;

// 28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int l = needle.length();
        int n = haystack.length() - l;
        for (int i = 0; i <= n; i++) {
            String substring = haystack.substring(i, i + l);
            if (substring.equals(needle)) return i;
        }
        return -1;
    }
}
