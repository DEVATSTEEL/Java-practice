import java.util.Random;

public class RandomFuction {
    public static void main (String[] args){

      Random random = new Random();
      
      int a = random.nextInt(70)+1;

      double b = random.nextDouble();

      boolean c = random.nextBoolean();

      long f = random.nextLong();
 
      System.out.println(a);

      System.out.println(b);

      System.out.println(c);

      System.out.println(f);

    }
}
