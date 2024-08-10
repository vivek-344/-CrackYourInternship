import java.util.*;

// 138. Copy List with Random Pointer
// https://leetcode.com/problems/copy-list-with-random-pointer/
public class CopyListWithRandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node og = head;
        HashMap<Node, Integer> map = new HashMap<>();
        ArrayList<Node> list = new ArrayList<>();
        int i = 0;
        while (head != null) {
            int val = head.val;
            list.add(new Node(val));
            map.put(head, i);
            i++;
            head = head.next;
        }
        head = og;
        i = 0;
        while (head != null) {
            Node rand = head.random;
            int index = map.getOrDefault(rand, -1);
            Node curr = list.get(i);
            if (i < list.size() - 1) curr.next = list.get(i + 1);
            if (index != -1) curr.random = list.get(index);
            head = head.next;
            i++;
        }
        return list.get(0);
    }
}
