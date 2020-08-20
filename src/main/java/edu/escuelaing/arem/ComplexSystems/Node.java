package edu.escuelaing.arem.ComplexSystems;

/**
 * @author Santiago
 */
public class Node {
    private double data;
    private Node next;

    /**
     *  Get the data of the node
     * @return decimal number in the node
     */
    public double getData() {
        return data;
    }

    /**
     * Set the data of the node
     * @param data decimal number
     */
    public void setData(double data) {
        this.data = data;
    }

    /**
     * Get the next node of the current node
     * @return next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Set the next node of the current node
     * @param next next node
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
