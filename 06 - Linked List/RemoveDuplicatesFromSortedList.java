// 83. Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(0);
        ListNode ref = node;
        while (head != null) {
            int val = head.val;
            node.next = new ListNode(val);
            node = node.next;
            while (head != null && head.val == val) {
                head = head.next;
            }
        }
        return ref.next;
    }
}
