package edu.escuelaing.arem.ComplexSystems;

/**
 * @author Santiago R.
 */
public class App {
    /**
     * Main execution method to execute the entire program
     *
     * @param args
     */
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.read(args[0]);
    }
}
