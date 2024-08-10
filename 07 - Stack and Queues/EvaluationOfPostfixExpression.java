import java.util.Stack;

// Geeks for Geeks: Evaluation of Postfix Expression
// https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1
public class EvaluationOfPostfixExpression {
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> stack = new Stack<>();
        for (char ch: S.toCharArray()) {
            if (ch >= '0' && ch <= '9')
                stack.push(ch-'0');
            else if (ch == '+') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            } else if (ch == '-') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            } else if (ch == '*') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            } else if (ch == '/') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
        }
        return stack.pop();
    }
}
