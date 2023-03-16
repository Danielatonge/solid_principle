package OpenClosed.start;

/* GOAL: Classes should be open for extension,
 * closed for modification
 */

/*
 * Consider a class FileGenerator. Aside from printing the report to the console,
 * we wish to generate the report in various file formats TXT, RTF, PDF.
 */

/*
 * Questions:
 * What is really wrong?
 * */
public class FileGenerator {

    public void generateTXT(String data) {
        System.out.println("Generating TXT from " + data);
    }

    public void generateRTF(String data) {
        System.out.println("Generating RTF from " + data);
    }

    public void generatePDF(String data) {
        System.out.println("Generating PDF from " + data);
    }
}
