// 234. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode ref = head;
        while (head != null) {
            len++;
            head = head.next;
        }
        head = ref;
        int mid = len/2;
        ListNode curr = head;
        ListNode prev = null;
        for (int i = 0; i < mid; i++) {
            ListNode temp = head.next;
            curr.next = prev;
            prev = curr;
            head = temp;
            curr = head;
        }
        if (len%2 != 0) curr = curr.next;
        while (curr != null) {
            if (prev.val != curr.val) return false;
            prev = prev.next;
            curr = curr.next;
        }
        return true;
    }
}
