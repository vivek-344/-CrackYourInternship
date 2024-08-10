// 445. Add Two Numbers II
// https://leetcode.com/problems/add-two-numbers-ii/
public class AddTwoNumbersII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        return reverse(sum(l1, l2));
    }

    public ListNode sum(ListNode l1, ListNode l2) {
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

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }
}
