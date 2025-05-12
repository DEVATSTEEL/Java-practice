import java.util.Scanner;

public class MathOperatorators {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int money = 100100;
        money = money + 1000;
        System.out.println(money);
        money = money - 1000;
        System.out.println(money);
        money = money * 8;
        System.out.println(money);
        money = money / 2;
        System.out.println(money);
        money = money % 2;
        System.out.println(money);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number");
        Double cal = scanner.nextDouble();
        cal = cal / 3;
        System.out.println(cal);
        cal = cal % 3;
        System.out.println(cal);
        scanner.close();
    }
}
