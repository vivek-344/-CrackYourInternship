// 203. Remove Linked List Elements
// https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        ListNode ref = node;
        while (head != null) {
            if (head.val != val) {
                node.next = new ListNode(head.val);
                node = node.next;
            }
            head = head.next;
        }
        return ref.next;
    }
}
