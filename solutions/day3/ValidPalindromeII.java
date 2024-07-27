package solutions.day3;

// 680. Valid Palindrome II
// https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        boolean flag = true;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else if (isPalindrome(s.substring(start, end)) || isPalindrome(s.substring(start + 1, end + 1))) return true;
            else return false;
        }
        return true;
    }

    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
