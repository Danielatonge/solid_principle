package OpenClosed.start;

/* GOAL:
 * Components should be open for extension,
 * closed for modification
 */

/*
 * Context:
 * Consider a class FileGenerator. Aside from printing the report to the console,
 * we wish to generate the report in various file formats TXT, RTF, PDF.
 */

/*
 * Questions:
 * Add functionality to generate JPEG files without violating the OCP
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
