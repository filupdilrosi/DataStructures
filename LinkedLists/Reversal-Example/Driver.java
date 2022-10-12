package LinkedLists;


public class LinkedListStarter {

    public static void writeList(Node nextNode) {

        if (nextNode != null) {
            System.out.println(nextNode.getData());

            writeList(nextNode.getNextNode());
        }
    } // end writeList


    public static void writeListReverse(Node nextNode) {

        if (nextNode != null) {
            writeListReverse(nextNode.getNextNode());

            System.out.println(nextNode.getData());
        }
    } // end writeListReverse



    public static void main(String args[]) {
        
        Node myNode = new Node(5);
        System.out.println(myNode.toString());

        /*
        Node myNode2 = new Node(8);
        myNode.setNextNode(myNode2);

        Node myNode3 = new Node(11);
        myNode2.setNextNode(myNode3);

        Node current = myNode;

        while (current != null) {
            System.out.println(current.toString());
            current = current.getNextNode();
        }*/


        LinkedList myLinkedList = new LinkedList();

        myLinkedList.addAtBeginning(7);
        myLinkedList.addAtBeginning(3);
        myLinkedList.addAtBeginning(3);
        myLinkedList.addAtBeginning(1);
        myLinkedList.addAtBeginning(3);

        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.getSize());

        myLinkedList.removeFirstNode();
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.getSize());

        myLinkedList.remove(1);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.getSize());

        System.out.println("List Contents: ");
        writeList(myLinkedList.getHead());
        System.out.println("List Contents Reverse: ");
        writeListReverse(myLinkedList.getHead());


    }
}
