// Geeks for Geeks: Rearrange a Linked List in Zig-Zag Fashion
// https://www.geeksforgeeks.org/linked-list-in-zig-zag-fashion/
public class RearrangeALinkedListInZigZagFashion {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    ListNode zigZag(ListNode head) {
        if (head == null || head.next == null) return head; // Handle edge case
        ListNode ref = head;
        boolean count = false;
        while (head.next != null) {
            if ((count && head.val < head.next.val) || (!count && head.val > head.next.val)) {
                swap(head, head.next);
            }
            head = head.next;
            count = !count;
        }
        return ref;
    }

    void swap(ListNode a, ListNode b) {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
}
