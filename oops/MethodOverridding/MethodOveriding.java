public class MethodOveriding {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        
    }
    
}