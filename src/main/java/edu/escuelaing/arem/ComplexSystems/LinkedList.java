package edu.escuelaing.arem.ComplexSystems;

/**
 * @author Santiago R.
 */
public class LinkedList {
    private Node head;
    private Node tail;

    /**
     * Get the first node of the linkedlist
     * @return first node
     */
    public Node getHead() {
        return head;
    }

    /**
     * Set the first node of the linkedlist
     * @param head
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * Get the last node of the linkedlist
     * @return last node
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Set the last node of the linkedlist
     * @param tail
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * Display the data set given a node of the data set
     * @param node node of the data set to display
     */
    public void printLinkedList(Node node) {
        if (node == null) {
            System.out.println("\n");
            return;
        } else {
            System.out.format(node.getData() + " ");
            printLinkedList(node.getNext());
        }
    }

    /**
     * Insert nodes to the LinkedList
     *
     * @param data decimal number to be added to the data set
     */
    public void insertNode(double data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }


}
