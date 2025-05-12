public class VariableSwap {
    public static void main (String args []) {
     String a = "Hello" ;
     String b = "World" ;
     String temp ;

     temp = a;
     a=b;
     b=temp;

     System.out.println("a: "+a);
     System.out.println("b: "+b);
    }
    
}
