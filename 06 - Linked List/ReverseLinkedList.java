// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(head != null) {
            ListNode temp = head.next;
            curr.next = prev;
            prev = curr;
            head = temp;
            curr = head;
        }
        return prev;
    }
}
