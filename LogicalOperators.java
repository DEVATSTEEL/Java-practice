import java.util.Scanner;

public class LogicalOperators {

    /*
     * && operator = (AND) both conditions must be true
     * 
     * @SuppressWarnings("ConvertToTryWithResources")
     * public static void main (String []args){
     * 
     * Scanner reader = new Scanner(System.in);
     * System.out.println("Enter Temprature of your sorrounding");
     * int temp = reader.nextInt();
     * 
     * if(temp>40) {
     * System.out.println(" It's Hot plese carry Sun-scream");
     * }
     * else if(temp>=20 && temp<=40){
     * System.out.println(" Wheather is nice today");
     * }
     * else {
     * System.out.println("It is cold outside please carry Sweater");
     * }
     * reader.close();
     * }
     */


     /* In || = (OR) either condition must be true

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" You are playing a game  Press Q or q to quit ");
        String reply = reader.next();

        if (reply.equals("q") || reply.equals("Q")) {
            System.out.println(" You quit the game ");
        } else {
            System.out.println(" You are Still playing the game ");
        }
        reader.close();
    } */

    //!  = (NOT) reverses boolean value of a condition
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "JavaRocks";

        System.out.print("Enter password: ");
        String input = scanner.nextLine();

        if (!input.equals(correctPassword)) {
            System.out.println("Access Denied.");
        } else {
            System.out.println("Access Granted!");
        }

        scanner.close();
    }

}
