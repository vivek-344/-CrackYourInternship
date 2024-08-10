import java.util.*;

// 225. Implement Stack using Queues
// https://leetcode.com/problems/implement-stack-using-queues/
public class ImplementStackUsingQueues {
    static class MyStack {

        Queue<Integer> stack;

        public MyStack() {
            stack = new LinkedList<>();
        }

        public void push(int x) {
            Queue<Integer> q = new LinkedList<>();
            while (!stack.isEmpty())
                q.add(stack.remove());
            stack.add(x);
            while(!q.isEmpty())
                stack.add(q.remove());
        }

        public int pop() {
            return stack.remove();
        }

        public int top() {
            return stack.peek();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
