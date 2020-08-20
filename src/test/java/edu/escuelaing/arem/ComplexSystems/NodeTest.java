package edu.escuelaing.arem.ComplexSystems;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Santiago R.
 */
public class NodeTest {
    public Node node;

    /**
     * Should create an empty node
     */
    @Test
    public void shouldCreateEmptyNode() {
        node = new Node();
        Assert.assertEquals(0.0, node.getData(), 0);
        Assert.assertEquals(null, node.getNext());
    }

    /**
     * Verify to be able to add data to an empty node
     */
    @Test
    public void shouldBeAbleToAddDataToNode() {
        node = new Node();
        node.setData(50);
        Assert.assertEquals(50.0, node.getData(), 0);
    }

    /**
     * Verify to be able to add a next node by checking the data of the new next
     * node
     */
    @Test
    public void shouldBeAbleToAddNextNode() {
        node = new Node();
        node.setData(10);
        Node node2 = new Node();
        node2.setData(20);
        node.setNext(node2);
        Assert.assertEquals(20, node.getNext().getData(), 0);
    }
}
