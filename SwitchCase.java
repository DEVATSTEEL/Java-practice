import java.util.Scanner;

public class SwitchCase {

 @SuppressWarnings("ConvertToTryWithResources")
 public static void main(String[]args) {
  
    Scanner reader = new Scanner (System.in);

    System.out.println("Please enter the day ");

    String day = reader.nextLine();

    switch (day) {
        case "Sunday" -> System.out.println("It is Sunday ");
        case "Monday" -> System.out.println("It is Monday ");
        case "Tuesday" -> System.out.println("It is Tuesday ");
        case "Wedday" -> System.out.println("It is Wedday ");
        case "Thursday" -> System.out.println("It is Thursday ");
        case "Friday" -> System.out.println("It is Friday ");
        case "Saturday" -> System.out.println("It is Saturday ");
        default -> System.out.println("This is not any day please write the correct day of week");
    }
    reader.close();
 }   
}

//Older syntax 
/*switch (day) {
        case "Sunday": System.out.println("It is Sunday ");
        break;
        case "Monday": System.out.println("It is Monday ");
        break;
        case "Tuesday": System.out.println("It is Tuesday ");
        break;
        case "Wedday": System.out.println("It is Wedday ");
        break;
        case "Thursday": System.out.println("It is Thursday ");
        break;
        case "Friday": System.out.println("It is Friday ");
        break;
        case "Saturday": System.out.println("It is Saturday ");
        break;
        default: System.out.println("This is not any day please write the correct day of week");
        break;
    } */