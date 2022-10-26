package helpers;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        if (next == null) {
            return(String.valueOf(data));
        } else {
            return(String.valueOf(data) + ", " + next.toString());
        }
    }

    @Override
    public boolean equals(Object node) {

        Node cur = this;

        while (cur != null && node != null) {
            if (cur.data != ((Node) node).data) {
                return false;
            }
            cur = cur.next;
            node = ((Node) node).next;
        }
        if (cur == null ^ node == null) {
            return false;
        }
        return true;
    }

}
