import java.util.Stack;

// 402. Remove K Digits
// https://leetcode.com/problems/remove-k-digits/
class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char ch: num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && ch < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        while (!sb.isEmpty() && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return !sb.isEmpty() ? sb.toString() : "0";
    }
}