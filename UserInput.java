import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("What is your name ? ");
        
        String name = scanner.nextLine();

        System.out.println("How old are you");

        int age = scanner.nextInt();

        System.out.println("Hello "+name);

        System.out.println("You are "+age+" years old");

        System.out.println("Enter the first Float ");
        Double a = scanner.nextDouble();

        System.out.println("Enter the Second number ");
        int b = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the text");
        String c = scanner.nextLine();

        System.out.println("Enter the Bool");
        boolean d  = scanner.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        scanner.close();
    }
}

