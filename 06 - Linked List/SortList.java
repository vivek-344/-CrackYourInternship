// 148. Sort List
// https://leetcode.com/problems/sort-list/
public class SortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return merge(left, right);
    }

    ListNode merge(ListNode a, ListNode b) {
        ListNode node = new ListNode();
        ListNode ref = node;

        while (a != null && b != null) {
            if (a.val >= b.val) {
                node.next = b;
                b = b.next;
            } else {
                node.next = a;
                a = a.next;
            }
            node = node.next;
        }

        if (a != null) node.next = a;
        if (b != null) node.next = b;

        return ref.next;
    }
}
