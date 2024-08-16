import java.util.*;

// Geeks for Geeks: Rearrange a given linked list in-place
// https://www.geeksforgeeks.org/rearrange-a-given-linked-list-in-place/
class RearrangeAGivenLinkedListInPlace {
    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void reorderList(Node head) {
        if (head == null || head.next == null) return;
        HashMap<Integer, Node> map = new HashMap<>();
        int i = 0;
        Node current = head;
        while(head != null) {
            map.put(i, head);
            head = head.next;
            i++;
        }
        head = current;
        int n = i-1;
        for (int j = 0; j < n / 2; j++) {
            Node tmp = map.get(n - j);
            tmp.next = current.next;
            current.next = tmp;
            current = tmp.next;

            Node nextTmp = current.next;
            if (j + 1 < n / 2) {
                map.get(j + 1).next = nextTmp;
            }
        }
        if (n % 2 == 0) current.next = null;
        else map.get(n / 2).next.next = null;
    }
}