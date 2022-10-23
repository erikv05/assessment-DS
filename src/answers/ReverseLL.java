package answers;

import helpers.Node;

public class ReverseLL {
    
    public static Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node front = null;
        Node temp;

        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = front;
            front = temp;
        }

        return front;
    }

}
