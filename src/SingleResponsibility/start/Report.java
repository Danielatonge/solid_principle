package SingleResponsibility.start;

/* GOAL: Each class should have only one sole purpose,
 * and not be filled with excessive functionality
 */

/*
 * Consider a class named Report that reads information from a file,
 * and generates a report to be printed out to the console.
 * The input source type and output target could change in the near
 * future
 */

/*
 * Questions:
 * How many responsibilities does Report have?
 * What is really wrong?
 * */
public class Report {
    public void generateReport(String filename) {
        /* Read data from the file */
        StringBuilder data = new StringBuilder();

        /* Opening and reading the file until EOF */
        data.append("Empty string");

        // print the data to the console
        System.out.println(data);
    }
}

class Runner {
    public static void main(String[] args) {
        Report report = new Report();
        report.generateReport("sample_input_file");
    }
}
