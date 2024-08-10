import java.util.Stack;

// 844. Backspace String Compare
// https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '#') {
                if (!stackS.isEmpty()) stackS.pop();
            } else
                stackS.push(ch);
        }
        for (char ch: t.toCharArray()) {
            if (ch == '#') {
                if (!stackT.isEmpty()) stackT.pop();
            } else
                stackT.push(ch);
        }
        while (!stackS.isEmpty()) {
            if (stackT.isEmpty()) return false;
            if (stackS.pop() != stackT.pop()) return false;
        }
        return stackT.isEmpty();
    }
}
