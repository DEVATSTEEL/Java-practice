import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(" Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println(" Enter a whole number to divide by : ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
            
        } 
        catch(ArithmeticException | InputMismatchException e){
            System.err.println("You cant divide by zero");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally{
            System.err.println("Completed Operation");
        }
    }
    
}
