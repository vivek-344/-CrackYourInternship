// Geeks for Geeks: Segregate even and odd nodes in a Linked List
// https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
public class SegregateEvenAndOddNodesInALinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode segregate(ListNode head) {
        ListNode odds = new ListNode();
        ListNode refO = odds;
        ListNode evens = new ListNode();
        ListNode refE = evens;
        while (head != null) {
            if (head.val % 2 == 0) {
                evens.next = head;
                evens = evens.next;
            } else {
                odds.next = head;
                odds = odds.next;
            }
            head = head.next;
        }
        evens.next = refO.next;
        odds.next = null;
        return refE.next;
    }
}
