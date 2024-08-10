import java.util.HashSet;

// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null) {
            if (!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}
