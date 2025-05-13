import java.util.Scanner;

 public class MathFunctions {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String [] args) {
    
     double x;
     double y;
     double z;

     Scanner reader = new Scanner(System.in);
     System.out.println("Enter side x: ");
     x = reader.nextDouble();

     System.out.println("Enter side y: ");
     y = reader.nextDouble();

     z = Math.sqrt((x*x)+(y*y));

     System.out.println(" The Hypotenuse is : " +z);

     reader.close();
     
    }
 }