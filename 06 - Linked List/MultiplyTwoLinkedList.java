// Geeks for Geeks: Multiply Two Linked List
// https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1
public class MultiplyTwoLinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next = null;
        }
    }

    public long multiplyTwoLists(Node first, Node second) {
        long MOD = 1000000007;
        long num1 = 0;
        long num2 = 0;
        while (first != null || second != null) {
            if (first != null) {
                num1 = num1*10 + first.data;
                num1 %= MOD;
                first = first.next;
            }
            if (second != null) {
                num2 = num2*10 + second.data;
                num2 %= MOD;
                second = second.next;
            }
        }
        long product = num1*num2;
        product %= MOD;
        return product;
    }
}
