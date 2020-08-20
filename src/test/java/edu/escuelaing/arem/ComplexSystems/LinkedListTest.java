package edu.escuelaing.arem.ComplexSystems;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Santiago R.
 */
public class LinkedListTest {

    public LinkedList linkedList;

    /**
     * Verify that a new LinkedList should be empty
     */
    @Test
    public void shouldCreateEmptyLinkedList() {
        linkedList = new LinkedList();
        Assert.assertEquals(null, linkedList.getHead());
        Assert.assertEquals(null, linkedList.getTail());
    }

    /**
     * Verify the capacity to add numbers to the Linked list and be stored in the
     * correct order
     */
    @Test
    public void shouldCreateLinkedListAndBeAbleToAddNumbers() {
        linkedList = new LinkedList();
        for (int i = 1; i < 4; i++) {
            linkedList.insertNode(i);
        }
        Assert.assertEquals((double) 1, linkedList.getHead().getData(), 0);
        Assert.assertEquals((double) 2, linkedList.getHead().getNext().getData(), 0);
        Assert.assertEquals((double) 3, linkedList.getTail().getData(), 0);
    }

}
