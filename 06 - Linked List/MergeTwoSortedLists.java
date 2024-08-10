// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode ref = node;
        while (list1 != null || list2 != null) {
            int val1 = list1 != null ? list1.val : Integer.MAX_VALUE;
            int val2 = list2 != null ? list2.val : Integer.MAX_VALUE;
            if (val1 == val2) {
                node.next = new ListNode(val1);
                node = node.next;
                node.next = new ListNode(val2);
                node = node.next;
                list1 = list1.next;
                list2 = list2.next;
            }
            else if (list2 == null || val1 < val2) {
                node.next = new ListNode(val1);
                node = node.next;
                list1 = list1.next;
            } else {
                node.next = new ListNode(val2);
                node = node.next;
                list2 = list2.next;
            }
        }
        return ref.next;
    }
}
