package solutions.day8;

import java.util.*;

// 19. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put(0,null);
        int i = 1;
        while (head != null) {
            map.put(i, head);
            head = head.next;
            i++;
        }
        if (n == 1) {
            if (i == 2) return null;
            else {
                map.get(i-2).next = null;
                return res;
            }
        }
        ListNode left = map.get(i-n-1);
        if (left == null) return map.get(2);
        left.next = map.get(i-n+1);
        return res;
    }
}
