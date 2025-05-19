import java.util.ArrayList;

public class ForEachLoop {
  
    public static void main (String [] args){

     ArrayList<String> animals = new ArrayList<>();   

     animals.add("cat");
     animals.add("dog");
     animals.add("rat");
     animals.add("bird");

     for(String i : animals) {
        System.out.println(i);
     }
        
    }
    
}
