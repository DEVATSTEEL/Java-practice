public class Array {
    /* Directly declaring array
     * Array in java
     * public static void main(String\[] args) {
     *
     * String \[] cars = { "BMW","TESLA","FORD" } ;
     * cars\[1] = "Mahindra";
     * System.out.println(cars\[1]);
     * }
     */
    //Declaring array with set limit
    public static void main(String[] args) {
        String[] Gun = new String[3];
        Gun[0] = "Assault";
        Gun[1] = "Shotgun";
        Gun[2] = "Sniper";
     for (String Gun1 : Gun) {
         System.out.println(Gun1);
     }
    }
}