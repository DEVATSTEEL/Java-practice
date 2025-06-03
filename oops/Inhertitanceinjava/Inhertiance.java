public class Inhertiance {
    
    public static void main(String[] args) {
        
        DrivingCars cars = new DrivingCars();
        cars.go();

        Bycycle bike = new Bycycle();
        bike.stop();

        System.out.println(cars.doors);
        System.err.println(bike.wheels);

        
    }
}
