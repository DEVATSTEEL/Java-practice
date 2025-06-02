public class Inhertiance {
    
    public static void main(String[] args) {
        
        Cars cars = new Cars();
        cars.go();

        Bycycle bike = new Bycycle();
        bike.stop();

        System.out.println(cars.doors);
        System.err.println(bike.wheels);

        
    }
}
