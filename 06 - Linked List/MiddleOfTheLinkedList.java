// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        int nodes = 0;
        ListNode ref = head;
        while (head != null) {
            head = head.next;
            nodes++;
        }
        head = ref;
        for (int i = 0; i < nodes/2; i++)
            head = head.next;
        return head;
    }
}
