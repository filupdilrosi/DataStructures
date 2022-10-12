package LinkedLists;

public class Node {
    private int item;
    private Node next;

    public Node(int data, Node nextNode) {
        this.item = data;
        this.next = nextNode;
    }

    public Node(int data) {
        this(data, null);
    }

    public int getData() {
        return item;
    }

    public Node getNextNode() {
        return next;
    }

    public void setData(int data) {
        this.item = data;
    }

    public void setNextNode(Node nextNode) {
        this.next = nextNode;
    }

    @Override
    public String toString() {
        return ""+this.item;
    }

}
