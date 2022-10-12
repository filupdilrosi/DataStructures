package Lec12_end_a;

public class LinkedList {

    private Node head;
    private int size;


    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    // add a new node at the beginning of the list
    public void addAtBeginning(int value){
        Node newNode = new Node(value);

        newNode.setNextNode(this.head);
        this.head=newNode;

        this.size++;
    }

    // remove first node of the list
    public void removeFirstNode(){
        if (this.head!=null) {
            this.head = this.head.getNextNode();
            this.size--;
        }
    }

    // remove any node of the list
    public void remove(int index) {

        if (index >= 0 && index < getSize()) {
            if (index == 0) {
                head = head.getNextNode();
            }
            else {

                Node prev = this.head;
                for (int i = 0; i < index - 1 ; i++) {
                    if (prev != null)
                        prev = prev.getNextNode();
                }

                Node curr = prev.getNextNode();
                prev.setNextNode(curr.getNextNode());

            } // end if
            this.size--;
        } // end if

    }


    public Node getHead() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }


    @Override
    public String toString(){
        String str = "";
        Node curr = this.head;
        while(curr != null){
            str += "->" + curr.getData();
            curr = curr.getNextNode();
        }
        return str;
    }

}
