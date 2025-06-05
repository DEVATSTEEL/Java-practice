public class PolyMorphism {
    
    public static void main(String[] args) {
        
        PolyCar polyCar = new PolyCar();

        PolyBicycle polybicycle = new  PolyBicycle();

        PolyBoat polyboat = new PolyBoat();

        PolyVehicle[] racers = {polyCar,polybicycle,polyboat};

        for(PolyVehicle x : racers){
            x.go();
        }
    }
}
