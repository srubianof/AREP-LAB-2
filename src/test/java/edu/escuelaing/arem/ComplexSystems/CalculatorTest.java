package edu.escuelaing.arem.ComplexSystems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Santiago R.
 */
public class CalculatorTest {
    public Calculator calculator;
    public double[] set1 = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
    public double[] set2 = {15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
    public double[] set3 = {25, 73, 24, 13, 13, 12, 48, 9, 62, 43};
    public double[] set4 = {15, 19, 93, 93, 92, 12, 79, 76, 87, 59};
    public double[] set5 = {29, 31, 46, 75, 56, 2, 26, 25, 9, 4};
    public double[] set6 = {168, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};

    public LinkedList linkedSet1, linkedSet2, linkedSet3, linkedSet4, linkedSet5, linkedSet6;


    /**
     * Initialize the environment so the tests can be executed
     */
    @Before
    public void createLinkedListsAndCal() {
        calculator = new Calculator();
        linkedSet1 = new LinkedList();
        for (double number : set1) {
            linkedSet1.insertNode(number);
        }
        linkedSet2 = new LinkedList();
        for (double number : set2) {
            linkedSet2.insertNode(number);
        }
        linkedSet3 = new LinkedList();
        for (double number : set3) {
            linkedSet3.insertNode(number);
        }
        linkedSet4 = new LinkedList();
        for (double number : set4) {
            linkedSet4.insertNode(number);
        }
        linkedSet5 = new LinkedList();
        for (double number : set5) {
            linkedSet5.insertNode(number);
        }
        linkedSet6 = new LinkedList();
        for (double number : set6) {
            linkedSet6.insertNode(number);
        }
    }

    /**
     * Given a set of data the method should calculate the correct mean.
     */
    @Test
    public void shouldCalculateMean(){
        Assert.assertEquals(550.6, calculator.calculateMean(linkedSet1),0);
        Assert.assertEquals(60.32, calculator.calculateMean(linkedSet2),0);
        Assert.assertEquals(32.2, calculator.calculateMean(linkedSet3),0);
        Assert.assertEquals(62.5, calculator.calculateMean(linkedSet4),0);
        Assert.assertEquals(30.3, calculator.calculateMean(linkedSet5),0);
        Assert.assertEquals(637.1, calculator.calculateMean(linkedSet6),0);
    }

    /**
     * Given a set of data the method should calculate the correct standard deviation.
     */
    @Test
    public void shouldCalculateSD(){
        Assert.assertEquals(572.03, calculator.calculateStantardDeviation(linkedSet1),0);
        Assert.assertEquals(62.26, calculator.calculateStantardDeviation(linkedSet2),0);
        Assert.assertEquals(22.9, calculator.calculateStantardDeviation(linkedSet3),0);
        Assert.assertEquals(34.15, calculator.calculateStantardDeviation(linkedSet4),0);
        Assert.assertEquals(23.33, calculator.calculateStantardDeviation(linkedSet5),0);
        Assert.assertEquals(627.11, calculator.calculateStantardDeviation(linkedSet6),0);

    }
}
