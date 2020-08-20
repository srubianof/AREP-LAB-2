package edu.escuelaing.arem.ComplexSystems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * @author Santiago R.
 */
public class FileReader {
    /**
     * Method to read a file given its name, and calculate the mean
     * and standard deviation of the decimals read from the file.
     *
     * @param fileName
     */
    public void read(String fileName) {
        try {
            Calculator calculator = new Calculator();
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                LinkedList linkedList = new LinkedList();

                String data = scanner.nextLine();
                for (String c: data.split(" ")){
                    linkedList.insertNode(Double.parseDouble(c));
                }
                System.out.println("Mean: " + calculator.calculateMean(linkedList));
                System.out.println("Standard Deviation: " + calculator.calculateStantardDeviation(linkedList) +"\n");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}