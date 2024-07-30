package solutions.day5;

import java.util.*;

// 22. Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();

        recc(0, 0, "", n, list);

        return list;
    }

    void recc(int open, int close, String s, int n, ArrayList<String> list) {
        if (open == close && open + close == n*2) {
            list.add(s);
            return;
        }

        if (open < n)
            recc(open + 1, close, s+"(", n, list);

        if (close < open)
            recc(open, close + 1, s+")", n, list);
    }
}
