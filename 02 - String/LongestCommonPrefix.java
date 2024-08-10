// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        char[] ch = strs[0].toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (String s: strs) {
                if (i >= s.length() || s.charAt(i) != ch[i]) return str.toString();
            }
            str.append(ch[i]);
        }
        return str.toString();
    }
}
