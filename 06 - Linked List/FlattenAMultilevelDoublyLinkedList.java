// 430. Flatten a Multilevel Doubly Linked List
// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
public class FlattenAMultilevelDoublyLinkedList {

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        Node ref = head;
        while (head != null) {
            if (head.child != null)
                flatterer(head, head.child, head.next);
            head = head.next;
        }
        return ref;
    }

    void flatterer(Node head, Node child, Node next) {
        head.next = child;
        child.prev = head;
        head.child = null;

        Node last = child;
        while (last.next != null) {
            if (last.child != null)
                flatterer(last, last.child, last.next);
            last = last.next;
        }

        last.next = next;
        if (next != null)
            next.prev = last;
    }
}
