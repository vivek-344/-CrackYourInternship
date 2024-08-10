import java.util.*;

// 92. Reverse Linked List II
// https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedListII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode node = new ListNode(0);
        ListNode ref = node;
        int i = 1;
        while (i <= right) {
            if (i < left) {
                node.next = new ListNode(head.val);
                node = node.next;
            } else
                list.add(head);
            head = head.next;
            i++;
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            ListNode curr = list.get(j);
            int val = curr.val;
            node.next = new ListNode(val);
            node = node.next;
        }
        node.next = head;
        return ref.next;
    }
}

