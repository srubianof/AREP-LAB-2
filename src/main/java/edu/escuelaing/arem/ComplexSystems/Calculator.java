package edu.escuelaing.arem.ComplexSystems;

/**
 * @author Santiago R.
 */
public class Calculator {

    /**
     * Calculates the mean given a set of decimals
     *
     * @param linkedList LinkedList with a set of decimals
     * @return calculated mean for the given set.
     */
    public double calculateMean(LinkedList linkedList) {
        double mean = 0;
        double sum = 0;
        int quantity = 0;
        Node actualNode = linkedList.getHead();

        while (actualNode != null) {
            sum += actualNode.getData();
            quantity += 1;
            actualNode = actualNode.getNext();
        }
        mean = (double) Math.round((sum / quantity) * 100) / 100;
        return mean;
    }

    /**
     * Calculates the standard deviation given a set of decimals
     *
     * @param linkedList LinkedList with a set of decimals
     * @return calculated standard deviation for the given set.
     */
    public double calculateStantardDeviation(LinkedList linkedList) {
        double mean = calculateMean(linkedList);
//        System.out.println(mean);
        double sum = 0;
        int quantity = 0;
        double sd = 0;
        Node actualNode = linkedList.getHead();

        while (actualNode != null) {
            sum += Math.pow((actualNode.getData() - mean), 2);
            actualNode = actualNode.getNext();
            quantity += 1;
        }
        sd = (double) Math.round(Math.sqrt(sum / (quantity - 1)) * 100) / 100;

        return sd;
    }
}
