
public class TwoDimensionalArray {

    /*
    public static void main(String[] args) {

        String[][] Mobile = new String[3][3];

        Mobile[0][0] = "Motorola";
        Mobile[0][1] = "Samsung";
        Mobile[0][2] = "Redmi";
        Mobile[1][0] = "Realme";
        Mobile[1][1] = "Nokia";
        Mobile[1][2] = "Vivo";
        Mobile[2][0] = "Apple";
        Mobile[2][1] = "OnePlus";
        Mobile[2][2] = "Sony";

        for (String[] Mobile1 : Mobile) {
            for (String item : Mobile1) {
                System.out.print(String.format("%-10s", item) + "\t");
            }
            System.out.println();
        }
    } */

    public static void main(String[] args) {
        String[][] Mobile = {
            {"Motorola", "Samsung", "Redmi"},
            {"Realme", "Nokia", "Vivo"},
            {"Apple", "OnePlus", "Sony"}
        };

        for (String[] Mobile1 : Mobile) {
            for (String item : Mobile1) {
                System.out.print(String.format("%-10s", item) + "\t");
            }
            System.out.println();
        }

    }
}
