import java.util.ArrayList;

public class Array_List {
    
    public static void main ( String [] args){

        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("Pasta");
        food.add("Burger");
        food.add("Fries");
        food.add("Roll");
        food.add("Sandwhich");

        food.set(4, "Sushi");
        food.remove(5);
      //food.clear();

        for(int i=0; i<food.size(); i++ ){
            System.out.println(food.get(i));
        }
    }
}
