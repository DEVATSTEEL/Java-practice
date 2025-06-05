import  java.util.Scanner;

public class DynaPoly {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        PolyAnimal polyanimal;

        System.out.println("What animal do you want ");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                polyanimal = new PolyDog();
                polyanimal.speak();
            }
            case 2 -> {
                polyanimal = new PolyCat();
                polyanimal.speak();
            }
            default -> {
                polyanimal = new PolyAnimal();
                System.err.println(" That choice was invalid");
                polyanimal.speak();
            }
        }
    }
    
}
