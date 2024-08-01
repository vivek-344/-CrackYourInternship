package solutions.day7;

// 2. Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode node = res;
        int c = 0;
        while (l1 != null || l2 != null || c > 0) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int sum = a + b + c;
            c = sum / 10;
            sum %= 10;
            node.next = new ListNode(sum);
            node = node.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return res.next;
    }
}
