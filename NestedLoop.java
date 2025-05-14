
import java.util.Scanner;

public class NestedLoop {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int rows ;
        int columns ;
        char sign ;

        System.out.println(" Enter number of rows ");
        rows = reader.nextInt();

        System.out.println(" Enter number of columns ");
        columns = reader.nextInt();
        
        reader.nextLine(); 

        System.out.println(" Enter the Symbol ");
        sign = reader.nextLine().charAt(0);

        for (int b = 1; b <= rows; b++) {
            System.out.println();
            for (int a = 1; a <= columns; a++) {
                System.out.print(sign);
            }
        }
        reader.close();
    }
}
