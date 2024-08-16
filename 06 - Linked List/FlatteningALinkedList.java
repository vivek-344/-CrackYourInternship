// Geeks for Geeks: Flattening a Linked List
// https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1
class FlatteningALinkedList {
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }
    Node flatten(Node root) {
        Node head = root;
        Node ref = root;
        while (root != null) {
            while (ref.bottom != null) {
                ref = ref.bottom;
            }
            ref.bottom = root.next;
            root = root.next;
        }
        return sortList(head);
    }
    public Node sortList(Node head) {
        if (head == null || head.bottom == null) return head;

        Node slow = head;
        Node fast = head.bottom;

        while (fast != null && fast.bottom != null) {
            slow = slow.bottom;
            fast = fast.bottom.bottom;
        }

        Node middle = slow.bottom;
        slow.bottom = null;

        Node left = sortList(head);
        Node right = sortList(middle);

        return merge(left, right);
    }
    Node merge(Node a, Node b) {
        Node node = new Node(-1);
        Node ref = node;

        while (a != null && b != null) {
            if (a.data >= b.data) {
                node.bottom = b;
                b = b.bottom;
            } else {
                node.bottom = a;
                a = a.bottom;
            }
            node = node.bottom;
        }

        if (a != null) node.bottom = a;
        if (b != null) node.bottom = b;

        return ref.bottom;
    }
}