import java.util.Stack;

// Delete Nodes having Greater Value on Right
// https://www.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
public class DeleteNodesHavingGreaterValueOnRight {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node compute(Node head)
    {
        Stack<Node> stack = new Stack<>();
        Node node = null;
        Node ref = node;
        while (head != null) {
            if (stack.isEmpty() || stack.peek().data > head.data)
                stack.push(head);
            else {
                while (!stack.isEmpty() && stack.peek().data < head.data)
                    stack.pop();
                stack.push(head);
            }
            head = head.next;
        }
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            temp.next = node;
            node = temp;
        }
        return node;
    }
}
