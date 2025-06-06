import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        String filePath = "C:/Users/DELL/Documents/Java-practice/oops/files/art.txt";

        try (FileReader reader = new FileReader(filePath)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An I/O error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
