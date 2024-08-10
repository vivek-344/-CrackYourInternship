// Geeks for Geeks: Sort A Linked List Of 0s 1s Or 2s
// https://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/
public class SortALinkedListOf0s1sOr2s {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    ListNode sort(ListNode head) {
        ListNode zero = new ListNode(0);
        ListNode one = new ListNode(0);
        ListNode two = new ListNode(0);

        ListNode zeroRef = zero;
        ListNode oneRef = one;
        ListNode twoRef = two;

        while (head != null) {
            switch (head.val) {
                case 0:
                    zero.next = head;
                    zero = zero.next;
                    break;
                case 1:
                    one.next = head;
                    one = one.next;
                    break;
                case 2:
                    two.next = head;
                    two = two.next;
                    break;
            }
            head = head.next;
        }

        two.next = null;

        zero.next = oneRef.next;
        one.next = twoRef.next;
        return zeroRef.next;
    }
}
