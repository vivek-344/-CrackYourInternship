import java.util.Stack;

// Geeks for Geeks: Implement two stacks in an array
// https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
public class ImplementTwoStacksInAnArray {
    static class twoStacks {

        Stack<Integer>[] arr;

        twoStacks() {
            arr = new Stack[2];
            arr[0] = new Stack<>();
            arr[1] = new Stack<>();
        }

        // Function to push an integer into the stack1.
        void push1(int x) {
            arr[0].push(x);
        }

        // Function to push an integer into the stack2.
        void push2(int x) {
            arr[1].push(x);
        }

        // Function to remove an element from top of the stack1.
        int pop1() {
            if (arr[0].isEmpty())
                return -1;
            return arr[0].pop();
        }

        // Function to remove an element from top of the stack2.
        int pop2() {
            if (arr[1].isEmpty())
                return -1;
            return arr[1].pop();
        }
    }
}
