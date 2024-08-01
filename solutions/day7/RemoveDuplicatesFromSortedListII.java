package solutions.day7;

// 82. Remove Duplicates from Sorted List II
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ll = new ListNode(0);
        ListNode ref = ll;
        ListNode curr = head;

        while(curr.next != null) {
            if (curr.val == curr.next.val) {
                int val = curr.val;
                while(curr.next != null && curr.val == curr.next.val)
                    curr = curr.next;
                if (curr.next != null) curr = curr.next;
                if (curr.val != val && curr.next == null) ll.next = new ListNode(curr.val);
            }
            else {
                ll.next = new ListNode(curr.val);
                ll = ll.next;
                if (curr.next != null) curr = curr.next;
                if (curr.next == null) ll.next = new ListNode(curr.val);
            }
        }

        return ref.next;
    }
}
