import java.util.Scanner;

public class WhileLoop {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String [] args) {

        Scanner reader = new Scanner(System.in);
        String name = " ";

        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name = reader.nextLine();
        }

        System.out.println("Hello "+ name);

        reader.close();
        
    }
    
}
