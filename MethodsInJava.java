// method = a block of code that is executed whenever it is called upon

public class MethodsInJava {
    
    public static void main (String[] args ){

        String name = "Bro";
        int age = 21;
        hello(name,age);
       
        int a = 5;
        int b = 6;
        int z = add(a,b);
        System.out.println(z);
    }

    static void hello(String name , int age){
        System.out.println(" Hello "+ name);
        System.out.println("You are "+ age);
    } 

    static int add (int a,int b){
        int z = a + b;
        return z;
    }


}
