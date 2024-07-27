package solutions.day3;

import java.util.*;

// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (stack.isEmpty()) return false;
            else {
                char curr = stack.pop();
                if (curr == '(' && ch == ')') continue;
                else if (curr == '{' && ch == '}') continue;
                else if (curr == '[' && ch == ']') continue;
                else return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
