import java.util.*;

// 143. Reorder List
// https://leetcode.com/problems/reorder-list/
public class ReorderList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int i = 0;
        ListNode current = head;
        while(head != null) {
            map.put(i, head);
            head = head.next;
            i++;
        }
        head = current;
        int n = i-1;
        for (int j = 0; j < n / 2; j++) {
            ListNode tmp = map.get(n - j);
            tmp.next = current.next;
            current.next = tmp;
            current = tmp.next;

            ListNode nextTmp = current.next;
            if (j + 1 < n / 2) {
                map.get(j + 1).next = nextTmp;
            }
        }
        if (n % 2 == 0) current.next = null;
        else map.get(n / 2).next.next = null;
    }
}
