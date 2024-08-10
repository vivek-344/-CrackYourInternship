// 1290. Convert Binary Number in a Linked List to Integer
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class ConvertBinaryNumberInALinkedListToInteger {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null) {
            num += head.val;
            num = num << 1;
            head = head.next;
        }
        num = num >> 1;
        return num;
    }
}
