import java.util.Scanner;

public class DoWhileLoop {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String [] args) {

        Scanner reader = new Scanner(System.in);

        String name = "";

        do{
            System.err.println("Enter your name: ");
            name = reader.nextLine();
          }while(name.isBlank());
        

        System.out.println("Hello "+ name);

        reader.close();
        
    }
}
