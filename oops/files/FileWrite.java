import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        var folderPath = "C:\\Users\\DELL\\Documents\\Java-practice\\oops\\files";
        String fileName = "poem.txt";

        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();  // ✅ Create folder if it doesn't exist
        }

        FileWriter writer = null;

        try {
            writer = new FileWriter(new File(folder, fileName));
            writer.write("Roses are red \nViolets are blue \nToo shy \nto say what I want to say");
            writer.append("\nA poem by DevAT");
            System.out.println("File written to: " + new File(folder, fileName).getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
