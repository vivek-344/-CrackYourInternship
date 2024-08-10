import java.util.Deque;
import java.util.LinkedList;

// Geeks for Geeks: Implement Stack Queue Using Deque
// https://www.geeksforgeeks.org/implement-stack-queue-using-deque/
public class ImplementStackQueueUsingDeque {
    static class Stack {

        private final Deque<Integer> deque;

        Stack() {
            deque = new LinkedList<>();
        }

        boolean isEmpty() {
            return deque.isEmpty();
        }

        int pop() {
            return deque.removeLast();
        }

        void push(int x) {
            deque.addLast(x);
        }

        int size() {
            return deque.size();
        }

        int peek() {
            return deque.getLast();
        }
    }

    static class Queue {

        private final Deque<Integer> deque;

        Queue() {
            deque = new LinkedList<>();
        }

        boolean isEmpty() {
            return deque.isEmpty();
        }

        int dequeue() {
            return deque.removeFirst();
        }

        void enqueue(int x) {
            deque.addLast(x);
        }

        int size() {
            return deque.size();
        }

        int peek() {
            return deque.getFirst();
        }
    }
}
