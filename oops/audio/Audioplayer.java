import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Audioplayer {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("C:/Users/DELL/Documents/Java-practice/oops/audio/Boom - Dyalla.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        try (Scanner scanner = new Scanner(System.in)) {
            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.nextLine().trim().toUpperCase();

                switch (response) {
                    case "P" -> {
                        clip.start();
                        System.out.println("Playing...");
                    }
                    case "S" -> {
                        clip.stop();
                        System.out.println("Stopped.");
                    }
                    case "R" -> {
                        clip.setMicrosecondPosition(0);
                        System.out.println("Reset.");
                    }
                    case "Q" -> {
                        clip.close();
                        System.out.println("Quitting.");
                    }
                    default -> System.out.println("Not a valid response.");
                }
            }
        }
    }
}
