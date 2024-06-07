
/* 
 * W.A.P. that copies itself in another file called code.txt.
 */
import java.io.*;

public class Eight {
    public static void main(String[] args)throws IOException {
        String inputPath = "./Eight.java";
        String outputPath = "code.txt";

        try (FileReader reader = new FileReader(inputPath);
                FileWriter writer = new FileWriter(outputPath)) {
            int data;
            while ((data = reader.read()) != -1) { // Reads one character at a time
                writer.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
