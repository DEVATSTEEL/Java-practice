import java.io.File;

public class FileExist {

    public static void main(String[] args) {
        File file = new File("C:\\\\Users\\\\DELL\\\\Documents\\\\Java-practice\\\\oops\\\\files\\Secret_message.txt");

        System.out.println("Looking in: " + System.getProperty("user.dir"));

        if (file.exists()) {
            System.out.println("This file exists");
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
        } else {
            System.err.println("This file doesn't exist");
        }
    }
}
