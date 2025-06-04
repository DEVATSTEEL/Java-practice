public class Encapsulation {
    public static void main(String[] args) {
        EncapCars encapcars = new EncapCars("Chevrolet", "Camaro", 2025);

        encapcars.setYear(2025);

        System.out.println(encapcars.getMaker());
        System.out.println(encapcars.getModel());
        System.out.println(encapcars.getYear());
    }
}
