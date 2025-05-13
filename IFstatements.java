
import java.util.Scanner;

public class IFstatements {

    @SuppressWarnings("ConvertToTryWithResources")

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number ");
        int age = reader.nextInt();

        if (age >= 75) {
            System.out.println("Ok Boomer");
        } else if (age >= 18) {
            System.out.println("you are an adult");
        } else if (age <= 14) {
            System.out.println("you are an child");

        } else {
            System.out.println("you are not an adult");
        }
        reader.close();
    }

}
