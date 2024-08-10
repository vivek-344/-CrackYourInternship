// 86. Partition List
// https://leetcode.com/problems/partition-list/
public class PartitionList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode();
        ListNode refL = lesser;
        ListNode higher = new ListNode();
        ListNode refH = higher;
        while (head != null) {
            if (head.val < x) {
                lesser.next = head;
                lesser = lesser.next;
            } else {
                higher.next = head;
                higher = higher.next;
            }
            head = head.next;
        }
        higher.next = null;
        lesser.next = refH.next;
        return refL.next;
    }
}
