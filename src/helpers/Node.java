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

}
