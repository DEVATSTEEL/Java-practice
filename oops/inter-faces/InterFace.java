
public class InterFace {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();

        rabbit.flee();

        Hawk hawk = new Hawk();

        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();

        // Fish fish = new Fish();
        //fish.flee();
    }

}
