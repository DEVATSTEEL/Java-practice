public class Objects {

    public static void main(String[] args) {

        Cars myCars = new Cars();

        System.out.println(myCars.name);
        System.out.println(myCars.model);
        System.out.println(myCars.year);
        System.out.println(myCars.color);
        System.out.println(myCars.price);

        myCars.drive();
        myCars.brake();
    }
}
