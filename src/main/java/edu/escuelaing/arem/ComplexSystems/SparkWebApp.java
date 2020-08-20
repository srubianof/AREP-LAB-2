package edu.escuelaing.arem.ComplexSystems;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class SparkWebApp {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Complex Systems Exercise</h2>"
                + "<h2>AREP 2020-2</h2>"
                + "<p> Please insert a set of numbers: <br> " +
                "Note that you have to separate them by a comma <br>" +
                "The program will help you to calculate the mean and standard deviation</p>"
                + "<form action=\"/results\">"
                + "  Set of numbers:<br>"
                + "  <input type=\"text\" name=\"data\" >"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {

        LinkedList linkedList = new LinkedList();
        Calculator calculator = new Calculator();

        String [] data = req.queryParams("data").split(",");
        for (String i: data){
            linkedList.insertNode(Double.parseDouble(i));
        }
        Double resMean = calculator.calculateMean(linkedList);
        Double resSD = calculator.calculateStantardDeviation(linkedList);

        return  "The aritmethic mean from the given data set is: " +resMean + " \n Now the Standard Deviation is :"+
                resSD;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     * <p>
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
