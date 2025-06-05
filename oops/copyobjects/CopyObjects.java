public class CopyObjects {

    public static void main(String[] args) {

        
        DupCars car1 = new DupCars("Chevrolet", "Camaro", 2021);

        // Create a copy using copy constructor
        DupCars car2 = new DupCars(car1);

        // Print object references using toString (recommended)
        System.out.println("Car 1: " + car1);
        

        // Print individual properties
        System.out.println();
        System.out.println("Car 1 Make: " + car1.getMaker());
        System.out.println("Car 1 Model: " + car1.getModel());
        System.out.println("Car 1 Year: " + car1.getYear());

        System.out.println();
        System.out.println("Car 2 Make: " + car2.getMaker());
        System.out.println("Car 2 Model: " + car2.getModel());
        System.out.println("Car 2 Year: " + car2.getYear());
    }
}
